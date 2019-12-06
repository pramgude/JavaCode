
public class Shape {
	protected int sides;
	public Shape() {
		sides=3;
	}
	public int getSides()
	{
		return sides;
	}
	public void printSides()
	{
		System.out.println("The object has :" +sides + "sides " );
	}
}
class Square extends Shape
{
	public Square(int nSides)
	{
		sides=nSides; //don't need to call super class constructor due to protected type of variable
	}
}
class ProtectedVeriable
{
	
	public static void main(String[] args) {
		Square sobj=new Square(10);
		sobj.printSides();

	}

}
