
public class MultiThreadingDemo extends Thread {
	public void run()
	{
		System.out.println("My thread is running state");
	}

	public static void main(String[] args) {
		MultiThreadingDemo d=new  MultiThreadingDemo();
		d.start();   //My thread is running state

	}

}
