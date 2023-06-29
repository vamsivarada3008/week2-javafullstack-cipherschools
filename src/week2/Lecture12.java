package week2;
class A{
	A(){
		System.out.println("A constructor");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B Constructor");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("C Constructor");
	}
}
public class Lecture12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		B obj2=new B();
		A obj3=new A();
		

	}

}
