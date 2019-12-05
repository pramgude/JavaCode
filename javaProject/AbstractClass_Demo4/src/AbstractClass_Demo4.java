
public abstract class AbstractClass_Demo4 {
	abstract void getVal(String name);
	abstract void display();
}
class MainClass extends AbstractClass_Demo4
{
	String name;
	@Override
	void getVal(String name) {
		this.name=name;
		
	}

	@Override
	void display() {
		System.out.println("Hello" +name);   //HelloSampleCode
		
	}
}
class Class1
{
	

	public static void main(String[] args) {
		MainClass obj=new MainClass();
		obj.getVal("SampleCode");
		obj.display();

	}

	

}
