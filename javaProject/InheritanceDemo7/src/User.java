
public class User {
	String name;
	int age;
	long ph;
}
class Employee extends User
	{
		String specialization;
	}
class Manager extends User
{
	String department;
}
class Main
{
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.name="Mahesh");
		System.out.println(e.age=25);
		System.out.println(e.ph=123456l);
		System.out.println(e.specialization="Java");
		Manager m=new Manager();
		System.out.println(m.name="Sagar");
		System.out.println(m.age=26);
		System.out.println(m.ph=1234l);
		System.out.println(m.department="Development");

	}

}
