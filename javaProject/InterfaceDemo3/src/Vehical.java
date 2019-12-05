
public class Vehical implements Moveable {

	@Override
	public void move() {
		System.out.println("Average speed is :" +AVG_SPEED);
		
	}

	public static void main(String[] args) {
		Vehical v=new Vehical();
		v.move();  //Average speed is :40

	}


}


//here origin code is
//public interface Moveable {
//	int AVG_SPEED=40;
//	 void move(); //compile time error is occure bcz accsess modifier is missing
//}