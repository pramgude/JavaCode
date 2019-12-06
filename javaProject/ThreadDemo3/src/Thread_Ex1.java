
public class Thread_Ex1 extends Thread {
	String text=null;
	
	public Thread_Ex1(String str) {
		text=str;
		start();
	}
	public void run()
	{
		System.out.println(text);
	}
}
class MainClass
{
	public static void main(String[] args) {
		new Thread_Ex1("Thread activity started");
	}

}
