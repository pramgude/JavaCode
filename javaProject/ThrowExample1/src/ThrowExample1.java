
public class ThrowExample1 {
	static void checkEligibilty(int stuAge,int stuWeight)
	{
		if(stuAge<20 || stuWeight<40)
			throw new ArithmeticException("Student is not eligible");
		else
			System.out.println("Entries valid !!!");
	}

	public static void main(String[] args) {
		System.out.println("WELCOME...............");
		checkEligibilty(10,39);
		System.out.println("Have a nice day");

	}

}
/*
 * o/p:
 * WELCOME............... 
 * Exception in thread "main" java.lang.ArithmeticException: Student is not eligible
 */