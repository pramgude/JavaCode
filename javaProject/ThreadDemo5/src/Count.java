
public class Count implements Runnable{
	Thread myThread;
	public Count() {
		//myThread=new Thread("My runnable thread" +this);
		
		System.out.println("my thread created" +myThread);
		//myThread.start();
		
	}
	@Override
	public void run() {
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("printing the count" +i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("My thread interrupted");
		}
		System.out.println("My thread run is over");
	}
}
class RunnableExample
{
	public static void main(String[] args) {
		Count c=new Count();
		Thread myThread=new Thread(c);
		myThread.start();
		try
		{
			while(c.myThread.isAlive())
			{
				System.out.println("Thread is allive");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread is interrupted");
		}
		System.out.println("Main thread is over");
	}

	

}
