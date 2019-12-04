
public class Parent {
	int age;
	String name;
	double salary;
	
	public Parent(int age,String name,double salary) {
		this.age=age;
		this.name=name;
		this.salary=salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Parent [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
