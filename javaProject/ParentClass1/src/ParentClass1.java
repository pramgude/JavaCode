
public class ParentClass1 {
	public ParentClass1() {
		System.out.println("Constructor of ParentClass");
	}
	
}
class SubClass extends ParentClass1
{
	public SubClass() {
		
	}
	SubClass(int num)
	{
		System.out.println("Constructor with arg");
	}
	void display()
	{
		System.out.println("Hello");
	}
}
class Test
{
	public static void main(String[] args) {
		SubClass subClass=new SubClass();
		subClass.display();
		SubClass subClass2=new SubClass(10);
		subClass2.display();

	}

}
