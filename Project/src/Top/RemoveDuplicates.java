package Top;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicateChars(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) { // Add returns false if the character is already in the set
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String name = "AABBBCCDEE";
        System.out.println("Original: " + name);
        System.out.println("Without Duplicates: " + removeDuplicateChars(name));
    }
}
