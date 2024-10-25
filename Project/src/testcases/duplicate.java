package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*  String originalstring = "Aravind";
	       
	       StringBuilder reverseString = new StringBuilder (originalstring);
	       
	       reverseString.reverse();
	       
	       System.out.print("original"+originalstring);
	       
	       System.out.print("original"+reverseString.toString());
	       
	     //////////////////// duplicates ////////////////
		        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);

		        // Use a HashSet to remove duplicates
		        Set<Integer> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

		        // Convert back to List if needed
		        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

		        System.out.println("Original List: " + listWithDuplicates);
		        System.out.println("List Without Duplicates: " + listWithoutDuplicates);
		  
		  
		        List<String> namesWithDuplicates = Arrays.asList("John", "Sarah", "John", "Alice", "Bob", "Alice");

		        // Using LinkedHashSet to preserve insertion order and remove duplicates
		        Set<String> namesWithoutDuplicates = new LinkedHashSet<>(namesWithDuplicates);

		        // Convert back to list if needed
		        List<String> namesListWithoutDuplicates = new ArrayList<>(namesWithoutDuplicates);

		        System.out.println("Original Names List: " + namesWithDuplicates);
		        System.out.println("Names Without Duplicates: " + namesListWithoutDuplicates);
		  
		  */
		  List<String> duplicate = Arrays.asList("John", "Sarah", "John", "Alice", "Bob", "Alice");
		  
		  Set<String>  noduplicat = new HashSet(duplicate);
		  
		  List<String> neoduplicat = new ArrayList (noduplicat);
		  
		  
		  System.out.print(neoduplicat);
		  
		  
	  }
	  
	
		  
	       
	  }

	
	
	  
