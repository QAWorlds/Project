package mytestrtest;

public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = ("arAV  ind");
		
		String tm = name .replaceAll("\\s+", "");
		
		String work = tm .toUpperCase();
		
		System.out.println(tm);
		
		
	
	}

}
