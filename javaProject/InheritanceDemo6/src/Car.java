
public class Car {
	public Car() {
		System.out.println("Constructor of class Car");
	}
	public void vehicalType()
	{
		System.out.println("Vehical Type :car");
	}
}
class Maruti extends Car
{
	public Maruti() {
		System.out.println("Constructor of Maruti");
	}
	public void brand()
	{
		System.out.println("Brand : Maruti");
	}
	public void speed()
	{
		System.out.println("Max Speed : 90KMPH");
	}
}
class Maruti800 extends Maruti
{
	public Maruti800() {
		System.out.println("Constructor of Maruti800");
	}
	public void speed()
	{
		System.out.println("Max speed : 800KMPH");
	}
	

	public static void main(String[] args) {
		Maruti800 obj=new Maruti800(); //1)Constructor of class Car 2)Constructor of Maruti 3)Constructor of Maruti800
		obj.vehicalType(); ///Vehical Type :car
		obj.brand();       //Brand : Maruti
		obj.speed();       //Max speed : 800KMPH

	}

}
