class MyClass2 implements Runnable
{
	
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("Thread started : "+ t.getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread ended :"+t.getName());
	}
	
}

public class JionExample {

	public static void main(String[] args) {
		Thread th1=new Thread(new MyClass2(),"th1");
		th1.start();
		Thread th2=new Thread(new MyClass2(),"th2");
		th2.start();
		Thread th3=new Thread(new MyClass2(),"th3");
		th3.start();
	}

}
//o/p:
/*
 * Thread started : th1
 * Thread started : th3
 * Thread started : th2
 * Thread ended:th1 
 * Thread ended :th2 
 * Thread ended :th3
 */