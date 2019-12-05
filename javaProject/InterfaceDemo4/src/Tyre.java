
public class Tyre implements Moveable, Rollable {
	 
	int width;

	@Override
	public boolean isRollable() 
	{
		return true;
	}

	@Override
	public boolean isMoveable()
	{
		return true;
	}

	public static void main(String[] args) {
		Tyre t=new Tyre();
		System.out.println(t.isMoveable()); //true
		System.out.println(t.isRollable()); //true

	}

}
