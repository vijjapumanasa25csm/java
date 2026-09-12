package Exception;

public class ThrowsDemo {
	
 static void test() throws
 InterruptedException {
	        Thread.sleep(1000);
	        System.out.println("Done");
	    }

	    public static void main(String[] args) {
	        try {
	            test();
	        }
	        catch (InterruptedException e) {
	            System.out.println("Exception handled");
	        }
	    }
	}


