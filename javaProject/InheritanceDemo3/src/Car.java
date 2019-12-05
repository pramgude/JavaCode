class Vehical
{
	String vehicalType;
}
public class Car extends Vehical {
	String modelType;
	public void showDetail()
	{
		vehicalType="Car";
		modelType="Sport";
		System.out.println(modelType + " " +vehicalType);
	}

	public static void main(String[] args) {
		Car car=new Car();
		car.showDetail(); //Sport Car

	}

}
