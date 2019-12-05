
public class Vehical {
	String color;
	private int speed;
	private int size;
	
	

	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = 1;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = 1;
	}

}
class Car extends Vehical
{
	int CC;
	int gears;
	int color;
}
class Test
{

	public static void main(String[] args) {
		Car car=new Car();
		car.color=200;
		car.setSpeed(200);
		car.setSize(22);
		car.CC=1000;
		car.gears=5;
		
		System.out.println("Color of Car :" +car.color); //200
		System.out.println("Speed of car :" +car.getSpeed()); //1
		System.out.println("Size of car :" +car.getSize()); //1
		System.out.println("CC of car :" +car.CC); //1000
		System.out.println("gears of car :" +car.gears); //5

	}

}
