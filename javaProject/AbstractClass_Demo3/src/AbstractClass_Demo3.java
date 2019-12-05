
public abstract  class AbstractClass_Demo3 {
	abstract void getName(String name);
	abstract void getGender(String gender);
}
abstract class AbstClass extends AbstractClass_Demo3
{
	abstract void getCity(String city);
	abstract void getCountry(String country);
}
class SubClass extends AbstClass
{
	String name,gender,city,country;
	@Override
	void getCity(String city) {
		this.city=city;
		
	}

	@Override
	void getCountry(String country) {
		
		this.country=country;
	}

	@Override
	void getName(String name) {
		
		this.name=name;
	}

	@Override
	void getGender(String gender) {
		
		this.gender=gender;
	}
	
	
	void display()
	{
		System.out.println("Name :" +name);
		System.out.println("Gender :" +gender);
		System.out.println("City :" +city);
		System.out.println("Counrty :" +country);
	}
	
}
class MainClass
{

	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.name="Balaji";
		obj.gender="Male";
		obj.city="Pune";
		obj.country="India";
		
		obj.display();

	}

}
