package testcases;

public class TestCase_001 {

    public static void login_as_gust_user (String[] args) {
        // Correct object initialization and method call
        drag_drop drag = new drag_drop();
        
        // Calling the method on the object
        try {
        	
        	
        	
			drag.dargthelement();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Ensure the method name matches exactly in the drag_drop class
    }
}
