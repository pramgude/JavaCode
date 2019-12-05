
public class Exception_ex2 {
	

	public static void main(String[] args) {
		int[] arr= {10,20,30};
		int num1=15;
		int num2=0;
		int sum=0;
		try
		{
			sum=num1/num2;
			System.out.println(sum);
			for(int i=0;i<10;i++)
			{
				System.out.println("The value of array" +arr[1]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Error :" +e);
		}

	}

}
//o/p :  Error :java.lang.ArithmeticException: / by zero