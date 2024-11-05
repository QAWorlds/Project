package testcases;

public class revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalstring = "Aravind";
	       
	       StringBuilder reverseString = new StringBuilder (originalstring);
	       
	       reverseString.reverse();
	       
	       System.out.println("original   =    "+originalstring);
	       
	       System.out.println("reversoriginal    =   "+reverseString.toString());
	}

}
