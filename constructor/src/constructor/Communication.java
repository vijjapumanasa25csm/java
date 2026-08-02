package constructor;
class A{
	int x=10;
	void add() {
		System.out.println("Add from first is:"+(x+20));
	}
}
// MULTILEVEL INHERITANCE
class B extends A{
	int y=200;
	void sub() {
		System.out.println("Sub from second is:"+(y-20));
	}
}
class C extends B{
	int z=5;
	void mul() {
		System.out.println("Mul from third is:"+(z*20));
	}
		
		
	}


public class Communication {

	public static void main(String[]args) { 
		B obj=new B();
		C obj1=new C();
		System.out.println("Variable:"+obj1.x);
		obj1.add();
		obj1.sub();
		obj1.mul();
	}
	

}