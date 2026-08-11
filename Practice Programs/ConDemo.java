package basics;

public class ConDemo { 
	int rollNO;
	String name;
	//constructor
	public ConDemo() {
	  this.rollNO = 1234;
	  this.name ="Suresh";
	  System.out.println("Variables are ready");
	}
	void showDetails() {
		System.out.println("My rollNO is:"+rollNO);
		System.out.println("My name is:"+name);
		}
	
public static void main(String[] args) {
	ConDemo cd=new ConDemo();
	cd.showDetails();
	

}
}
