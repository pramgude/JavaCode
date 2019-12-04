import java.io.IOException;

public class ThrowExample {
	void myMethod(int num) throws IOException,ClassNotFoundException
	{
		if(num==0)
			throw new IOException("Exception Message");
		else
			throw new ClassNotFoundException("Exception Message");
	}
}
class Demo
{
	
	public static void main(String[] args) {
		try
		{
			ThrowExample obj=new ThrowExample();
			obj.myMethod(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
//o/p:  java.lang.ClassNotFoundException: Exception Message
}
