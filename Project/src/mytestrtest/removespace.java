package mytestrtest;

public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = ("arAVind  ,     raj");
		
		String tm = name .replaceAll("\\s+", "");
		
		String work = tm .toLowerCase();
		
		System.out.println(work);
		
		
	
	}

}
