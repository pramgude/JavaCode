
public class MySingleTon {
	private static MySingleTon myobj;
	
	private MySingleTon()
	{
		
	}
	public static MySingleTon getInstance()
	{
		if(myobj == null)
		{
			myobj=new MySingleTon();
		}
		return myobj;
	}
	public void getSomeThing() 
	{
		System.out.println("I am here....");
	}
	public static void main(String[] args) {
		MySingleTon mySingleTon=new MySingleTon();
		mySingleTon.getSomeThing();

	}

}
