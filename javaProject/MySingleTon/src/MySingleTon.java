
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
			System.out.println("object is create within class");
		}
		return myobj;
	}
	public void getSomeThing() 
	{
		System.out.println("I am here....");
		
	}
	/*
	 * public void getSomeThing1() { System.out.println("I am here....");
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		//MySingleTon mySingleTon=new MySingleTon();
		//mySingleTon.getSomeThing();   //o/p:ClassNotFoundException
		MySingleTon obj=MySingleTon.getInstance();
		obj.getSomeThing();
		//System.out.println("Hii" + obj.getSomeThing());
		//System.out.println("Hii" + obj.getSomeThing1());
	}

}
