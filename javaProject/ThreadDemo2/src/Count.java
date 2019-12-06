
public class Count extends Thread{
	public Count() {
		super("my extending thread");
		System.out.println("my thread created " +this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("printing the thread" +i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("my thread interrupted");
		}
		System.out.println("My thread run is over");
	}
}
class ExtendingExample
{
	
	public static void main(String[] args) {
		Count c=new Count();
		try
		{
			while(c.isAlive())
			{
				System.out.println("Main thread  will be allive till the child thread is allive");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread run is over");
	}

}
