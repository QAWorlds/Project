package Top;

public class ReverseString {
	
	
	public static void main(String[] args) {
	      String originalstring = "Aravind";
	       
	       StringBuilder reverseString = new StringBuilder (originalstring);
	       
	       reverseString.reverse();
	       
	       
	       System.out.println("original = "+originalstring);
	       
	       System.out.println("original = "+reverseString.toString());

}
	
	/*public class ReverseStringWithLoop {
	    public static void main(String[] args) {
	        String original = "hello";
	        String reversed = "";

	      for(int i = original.length()-1; i >0 ; i --)
	       reversed += original.charAt(i);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }
	}

	*/
	
	
}