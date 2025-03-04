package testcases;

public class revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalstring = "Aravind";
		
		
		
		
		//for replace with another text
		
		
		
		String low = originalstring.replace("Aravind", "dev");
		System.out.println("original   =    "+low);
	       
		
		
		
	//for reverse the string	
		
		
		
		
	       StringBuilder reverseString = new StringBuilder (originalstring);
	       
	       reverseString.reverse();
	       System.out.println("original   =    "+originalstring);
	       
	       System.out.println("reversoriginal    =   "+reverseString.toString());
	}

}
