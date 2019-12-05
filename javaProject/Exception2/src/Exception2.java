
public class Exception2 {
	static int sum(int num1,int num2)
	{
		if(num1==0)
			throw new ArithmeticException("num1 is not valid");
		else
			System.out.println("Both number are correct");
		return num1+num2;
	}

	public static void main(String[] args) {
		int res=sum(0,12);
		System.out.println(res);
		System.out.println("Continun Next Statement");

	}

}
//o/p: Exception in thread "main" java.lang.ArithmeticException: num1 is not valid