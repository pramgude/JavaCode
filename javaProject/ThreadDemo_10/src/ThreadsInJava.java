class MyThread extends Thread
{
	public MyThread(String name) {
		super(name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("from"+" " +getName());
		}
	}
}

public class ThreadsInJava {

	public static void main(String[] args) {
		MyThread myThread=new MyThread("Thread 1");
		myThread.setPriority(5);
		myThread.start();
		
		MyThread myThread2=new MyThread("Thread 2");
		myThread2.setPriority(7);
		myThread2.start();
		System.out.println(myThread2.getPriority());

	}

}
