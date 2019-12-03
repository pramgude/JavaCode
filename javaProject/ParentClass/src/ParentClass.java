
public class ParentClass {
	int num= 100;
}
class SubClass extends ParentClass
{
	int num =110;
	void printNumber()
	{
		System.out.println(super.num); //100
	}
	public static void main(String[] args) {
		SubClass subClass=new SubClass();
		subClass.printNumber();

	}

}
