

 class OwnException extends Exception
{
	public OwnException(int msg) {
		super(String.valueOf(msg));
	}
	public OwnException(float msg)
	{
		super(String.valueOf(msg));
	}
	public OwnException(char msg)
	{
		super(String.valueOf(msg));
	}
	public OwnException(String msg)
	{
		super(msg);
	}
}

public class MainClass {
	public static void intFn() throws OwnException
	{
		System.out.println("Throwning OwnException from intFn()");
		throw new OwnException(10);
	}
	public static void floatFn() throws OwnException
	{
		System.out.println("Throwning OwnException from floatFn()");
		throw new OwnException((float)111.111);
	}
	public static void charFn() throws OwnException
	{
		System.out.println("Throwning OwnException from charFn()");
		throw new OwnException('A');
	}
	public static void stringFn() throws OwnException
	{
		System.out.println("Throwning OwnException from stringFn()");
		throw new OwnException("Java World .....");
	}

	public static void main(String[] args) {
		try
		{
			intFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			floatFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			charFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			stringFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
	}

}
/* Throwning OwnException from intFn()
OwnException: 10
	at MainClass.intFn(MainClass.java:26)
	at MainClass.main(MainClass.java:47)
Throwning OwnException from floatFn()
OwnException: 111.111
	at MainClass.floatFn(MainClass.java:31)
	at MainClass.main(MainClass.java:55)
Throwning OwnException from charFn()
OwnException: A
	at MainClass.charFn(MainClass.java:36)
	at MainClass.main(MainClass.java:63)
Throwning OwnException from stringFn()
OwnException: Java World .....
	at MainClass.stringFn(MainClass.java:41)
	at MainClass.main(MainClass.java:71)
 */