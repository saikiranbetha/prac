package assignment8;

class MultiThreadingUsingThreadClass extends Thread{
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}


class MultiThreadingUsingRunnableInterface implements Runnable{
	public void run()
    {
        try {
            
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThreading {

	public static void main(String[] args) {
		
		//MultiThreadingUsingThreadClass
		int n = 10;
		for (int i = 0; i<n; i++) {
			MultiThreadingUsingThreadClass Object = new MultiThreadingUsingThreadClass();
			Object.start();
		}
		
		
		//MultiThreadingUsingRunnableInterface
		
		int k = 8;
        for (int j = 0; j < k; j++) {
            Thread object
                = new Thread(new MultiThreadingUsingRunnableInterface());
            object.start();
        }
	}
}

