class MyClass implements Runnable
{
	
	
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("Thread started :" +t.getName());
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread ended :" +t.getName());
	}
}

public class JoinExample {

	public static void main(String[] args) {
		Thread th1=new Thread(new MyClass(),"th1");
		Thread th2=new Thread(new MyClass(),"th2");
		Thread th3=new Thread(new MyClass(),"th3");
		
		th1.start();
		try
		{
			th1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		th2.start();
		try
		{
			th2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		th3.start();
		try
		{
			th3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("All threads have finished execution ");
	}

}
//o/p:
/*
 * Thread started :th1 
 * Thread ended :th1
 * Thread started :th2
 * Thread ended :th2
 * Thread started :th3 
 * Thread ended :th3
 * All threads have finished execution
 */
