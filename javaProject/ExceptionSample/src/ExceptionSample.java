
class MyException extends Exception
{
	String str1;
	public MyException(String str2) {
		str1=str2;
	}
	public String toString()
	{
		return("Output String =" +str1);
	}
}
class CustomException
{
	public static void main(String[] args) {
		try
		{
			throw new MyException("Custom");
		}
		catch(MyException exp)
		{
			System.out.println("Hi this is my catch block");
			System.out.println(exp);
		}
	}
}
public class ExceptionSample {
		public void dispalyMymsg() throws Exception
		{
			for(int j=8;j>0;j--)
			{
				System.out.println("j =" +j);
				if(j==7)
					throw new MyException("This is my own Custom Exception message");
			}
		}
	public static void main(String[] args ) throws Exception {
		ExceptionSample es=new ExceptionSample();
		es.dispalyMymsg();
		
	}

}
