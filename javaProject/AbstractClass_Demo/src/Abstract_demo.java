
public abstract class Abstract_demo {
	public void disp1()
	{
		System.out.println("Concrete method of abstract class");
	}
	 
	abstract public void disp2();
}
class Test extends Abstract_demo

{
	
	public void disp2()
	{
		System.out.println("I am overriding method of abstract method");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.disp2();
		//t.disp1 ;// it is not possible
		Abstract_demo d=new Test();
		d.disp1();
		
		}

}


