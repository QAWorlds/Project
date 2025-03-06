import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    public static String getCellData(String filePath, String sheetName, int row, int col) throws IOException {
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        if (sheet == null) {
            throw new IllegalArgumentException("Sheet '" + sheetName + "' not found.");
        }

        Row dataRow = sheet.getRow(row);
        if (dataRow == null) return ""; // Handle missing row

        Cell cell = dataRow.getCell(col);
        if (cell == null) return ""; // Handle missing cell

        fis.close();
        return cell.toString(); // Returns value as String
    }
}
