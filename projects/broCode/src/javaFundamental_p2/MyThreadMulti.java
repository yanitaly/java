package javaFundamental_p2;

public class MyThreadMulti extends Thread{

	@Override
	public void run() {
		
		for(int i =10;i>0;i--) {
			System.out.println("Thread #1 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// System.out.println(1/0);  // intentionally inject an error to see threads are independent. 

		}
		System.out.println("Thread #1 is finished :)");
	}
}