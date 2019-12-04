

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
