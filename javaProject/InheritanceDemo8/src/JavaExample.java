class ClassA
{
	public void methodA()
	{
		System.out.println("Method of classA");
	
	}
}
class ClassB extends ClassA
{
	public void methodA()
	{
		System.out.println("method a is inheritated in class B");
	}
	public void methodB()
	{
		System.out.println("method of classB");
	}
}
class ClassC extends ClassA
{
	public void methodC()
	{
		System.out.println("method of classC");
	}
}
class ClassD extends ClassA
{
	public void methodD()
	{
		System.out.println("method of classD");
	}
}
public class JavaExample {

	public static void main(String[] args) {
		ClassB obj1=new ClassB();
		ClassC obj2=new ClassC();
		ClassD obj3=new ClassD();
		obj1.methodA();
		obj1.methodB();
		//obj2.methodA();
		//obj3.methodA();
		ClassA a=new ClassB();
		ClassA a1=new ClassC();
		ClassA a2=new ClassD();
		a.methodA();
	

	}

}
