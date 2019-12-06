
public class Thread_Ex2 implements Runnable {
	String text=null;
	Thread thread;
	public Thread_Ex2(String str) {
		text=str;
		thread=new Thread(this);
		thread.start();
		
	}


	@Override
	public void run() {
		System.out.println(text);
		
	}
}
class MainClass
{
	
	public static void main(String[] args) {
		
		new Thread_Ex2("Thread Activity is started...");
	}


}
