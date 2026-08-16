package basics;
 class Parent {
    String name = "Parent";

    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    String name = "Child";

    // final variable
    final int age = 20;

    // static variable
    static String college = "ANITS";

    Child(String name) {
        // this refers to current class variable
        this.name = name;
    }

    void show() {
        // this
        System.out.println("this.name = " + this.name);

        // super
        System.out.println("super.name = " + super.name);
        super.display();

        // final
        System.out.println("Final age = " + age);

        // static
        System.out.println("College = " + college);
    }
}

public class Main {
    public static void main(String[] args) {

        Child c = new Child("Sita");

        c.show();

        // Accessing static variable using class name
        System.out.println("Static college = " + Child.college);
    }
}


   