class Shared
{
	synchronized void methodOne(){
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+ "is relasising the lock and going to wait");//1
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(t.getName() +"got the object lock and going to wait");//3
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(t.getName() +"got the object lock back and can continue with it's execution ");//2
		
	}
		synchronized void methodTwo()
		{
			Thread t=Thread.currentThread();
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			notify();
			System.out.println("A thread which is waiting for lock of this object is notified by" +t.getName());
		}
}
	



public class ThreadsInJava {

	public static void main(String[] args) {
		final Shared s=new Shared();
		Thread t1=new Thread()
				{
					public void run()
					{
						s.methodOne();
					}
				};
				
		Thread t2=new Thread()
				{
					public void run()
					{
						s.methodTwo();
					}
				};
				t1.start();
				t2.start();
	}

}
