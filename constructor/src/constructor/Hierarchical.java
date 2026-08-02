package constructor;
class Arithmetic{
	int a=20;
	int b=30;
	void add() {
		System.out.println("addition="+(a+b));
			}
}
//hierarchical
	class Subtraction extends Arithmetic{
		void sub() {
			System.out.println("subtraction="+(a-b));
		}
	}
	class Multipli extends Arithmetic {
		void mul() {
			System.out.println("multi="+(a*b));
		}
	}

public class Hierarchical {
	public static void main(String[]args) {
		Subtraction s=new Subtraction();
		s.add();
		s.sub();
		Multipli m=new Multipli();
		m.add();
		m.mul();
		
		
	}

}

