
public abstract class AbstractClass_Demo2 {
	abstract void get(int a,int b);
	abstract void add();
	abstract void display();
}
class SubClass extends AbstractClass_Demo2
{
	int x,y,z;
	
	@Override
	void get(int a, int b) {
		x=a;
		System.out.println(x);
		y=b;
		System.out.println(y);
	}

	@Override
	void add() {
		z=x+y;
		System.out.println(z);
	}

	@Override
	void display() {
		System.out.println("The Addition is" +z);
		
	}
}
class MainClass
{
	

	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.get(10, 20);
		obj.add();
		obj.display();



	}

}
