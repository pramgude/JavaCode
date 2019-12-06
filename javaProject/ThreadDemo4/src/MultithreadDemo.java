
public class MultithreadDemo implements Runnable {
	@Override
	public void run() {
		System.out.println("My thread is in running state");	
	}


	public static void main(String[] args) {
		MultithreadDemo m=new MultithreadDemo();
		Thread tobj=new Thread(m);
		tobj.start();

	}

	
}
