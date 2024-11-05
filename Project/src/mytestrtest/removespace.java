package mytestrtest;

public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = ("aravind  ,     raj");
		
		String work = name .replaceAll("\\s+", "");
		
		System.out.print(work);
		
	}

}
