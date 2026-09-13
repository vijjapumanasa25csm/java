package basics;
abstract class base{
	int x;
	void sayMyName(){
		System.out.println("My name is abc");
	}
	abstract void sayMyAge();
	}
public class AbstractDemo extends base {
	void sayMyAge() {
		System.out.println("age in subclass is :19");
	}
	public static void main(String[]args) {
		AbstractDemo ad=new
				AbstractDemo();
		System.out.println(ad.x);
		ad.sayMyAge();
		ad.sayMyName();
	}

}
