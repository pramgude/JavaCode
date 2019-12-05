
public class Vehical {
	String color;
	int size;
	int speed;
	
	void display()
	{
		System.out.println("Color :" +color);
		System.out.println("Size : " +size);
		System.out.println("Speed :" +speed);
	}
}
class Car extends Vehical
{
	int CC;
	int gears;
	void displayCar()
	{
		System.out.println("Color of car is :" +color);  //black
		System.out.println("Speed of car is : "+speed); //200
		System.out.println("Size of car is :" +size); //22
		System.out.println("CC of car is :" +CC); //1000
		System.out.println("Gears of car is :" +gears); //6
	}
}
class Test
{
	public static void main(String[] args) {
		Car car=new Car();
		car.color="Black";
		car.size=22;
		car.speed=200;
		car.CC=1000;
		car.gears=6;
		car.displayCar();

	}

}
