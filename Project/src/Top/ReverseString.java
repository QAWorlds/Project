package Top;

public class ReverseString {
	
	
	public static void main(String[] args) {
	      String originalstring = "Aravind";
	       
	       StringBuilder reverseString = new StringBuilder (originalstring);
	       
	       reverseString.reverse();
	       
	       
	       System.out.println("original = "+originalstring);
	       
	       System.out.println("original = "+reverseString);

}
}