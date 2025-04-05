package Top;
import java.util.LinkedHashSet;

public class Testcase {
    
	public static String removeduplicate (String stg) {
		
		LinkedHashSet<Character> Set = new LinkedHashSet<>();
		
		
		StringBuilder result = new StringBuilder();
		
		for (char ch: stg.toCharArray()) {
			if( Set.add(ch)) {
				result.append(ch);
			}
		}
		
		
		
		
		
		
		
		return result.toString();
	
	
	
	
	
	
	
}

    public static void main(String[] args) {
        String name = "AABBBCCDEE";
        System.out.println("Original: " + name);
        System.out.println("Without Duplicates: " + removeduplicate(name));
    }
}