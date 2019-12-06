
public class ClassX {
	public void methodX()
	{
		System.out.println("class X method");
	}
}
class ClassY extends ClassX
{
	public void methodY()
	{
		System.out.println("class y method");
	}
}
class ClassZ extends ClassY
{
	public void methodZ()
	{
		System.out.println("class z method");
	}
	public static void main(String[] args) {
		ClassZ obj=new ClassZ();
		obj.methodZ(); //class z method
		obj.methodY();	//class y method
		obj.methodX(); //class x method

	}

}
