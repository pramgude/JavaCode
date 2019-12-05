
public class ParentClass2 {
	public ParentClass2() {
		System.out.println("Constructor of ParentClass2");
	}
}
class SubClass extends ParentClass2
{
	public SubClass() {
		super();
		System.out.println("Constructor of SubClass");
	}
	void dispaly()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		SubClass subClass=new SubClass();
		subClass.dispaly();
		
	}

}

/*
 * output: 
 * Constructor of ParentClass2 
 * Constructor of SubClass 
 * Hello
 */
