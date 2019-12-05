//import ClassA.ClassAInnerClass;

public class ClassA {
	public ClassA() {
		System.out.println("Constructor of classA");
	}
	
	static class ClassAInnerClass
	{
		 ClassAInnerClass()
		{
			System.out.println("Inner class constructor");
		}
		 public static void getname()
		 {
			 System.out.println("Hello");
		 }
	}
	static class ClassA_Another
	{
		//static ClassA_Another
		//{
			
		//}
	}
}
//static class ClassB extends ClassA
//{
	
//}
//static class ClassC extends ClassB
//{
	
//}
class Test
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a=new ClassA();
		
	}

}
