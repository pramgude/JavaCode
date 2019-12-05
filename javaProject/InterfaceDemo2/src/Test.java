
public class Test implements Interface2 {
	
	@Override
	public void method1() {
		
		System.out.println("Implements method1");
	}

	@Override
	public void method2() {
		System.out.println("Implements method2");
		
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.method1();  //
		t.method2();
		
	}

}
// here Interface2 is extends Inteface1
//public interface Interface2 extends Interface1 {
//	public void method2();  compile error is occure
//}
 
//here method of Interface1 is not declare so compile error is generated so declare parent interface method in child interface
///public interface Interface2 extends Interface1 {
//public void method2();
//void method1();
///}

