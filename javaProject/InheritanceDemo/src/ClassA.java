
public class ClassA {
	public void methodA()
	{
		System.out.println("BAse class method");
	}
}
class B extends ClassA
{
	public void methodB()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		B b=new B();
		b.methodA();  //BAse class method
		b.methodB();  //child class method

	}

}
