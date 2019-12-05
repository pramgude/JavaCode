
class MyOwnException extends Exception
{
	public MyOwnException(String msg)
	{
		super(msg);
	}
}

public class EmployeeTest {
	static void employeeAge(int age) throws MyOwnException
	{
		if(age<0)
			throw new MyOwnException("Age can't be less than zero");
		else
			System.out.println("Age is eligible");
			
	}

	public static void main(String[] args) {
		try
		{
			employeeAge(-2);
		}
		catch(MyOwnException e)
		{
			e.printStackTrace();
		}

	}

}
//o/p : MyOwnException: Age can't be less than zero