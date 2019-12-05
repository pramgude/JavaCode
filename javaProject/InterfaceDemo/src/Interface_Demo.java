

public class Interface_Demo implements InterfaceA,InterfaceB{
	
	@Override
	public void myMethod() {
		System.out.println("Multiple Inheritance example using interfaces");
		
	}

	public static void main(String[] args) {
		Interface_Demo demo=new Interface_Demo();
		demo.myMethod();    //Multiple Inheritance example using interfaces

	}

	

}
