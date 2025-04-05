package testcases;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.io.IOException;

public class MergeExtentReports {

    public static void main(String[] args) {
        // Folder containing JSON reports
        String reportsFolder = "C:/Users/Aravind/Downloads/";

        // Output path for merged report
        String mergedReportPath = "C:/Users/Aravind/Downloads/Merged_Report.html";

        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(mergedReportPath);

        extent.attachReporter(spark);

        try {
            // Merge JSON files (Replace with your actual JSON files)
            extent.createDomainFromJsonArchive(reportsFolder + "Execution_report19-03-2025_11-43-52.json");
            extent.createDomainFromJsonArchive(reportsFolder + "Execution_report18-03-2025_23-01-59.json");

            System.out.println("✅ Reports merged successfully!");

        } catch (IOException e) {
            System.out.println("❌ Error merging reports: " + e.getMessage());
        }

        extent.flush();

        System.out.println("✅ Merged report generated at: " + mergedReportPath);
    }
}
