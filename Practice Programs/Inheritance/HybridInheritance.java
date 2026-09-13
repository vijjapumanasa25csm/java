package basics;
interface I1 {
    int x = 100;

    void sample();
}

interface I2 extends I1 {
    int y = 200;

    void demo();
}

class Parent {
    void parentMethod() {
        System.out.println("From Parent class");
    }
}

class Child extends Parent implements I2 {

    @Override
    public void sample() {
        System.out.println("This is from interface 1");
    }

    @Override
    public void demo() {
        System.out.println("This is from interface 2");
    }

    void childMethod() {
        System.out.println("From Child class");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Child obj = new Child();

        System.out.println(I1.x);
        System.out.println(I2.y);

        obj.parentMethod();
        obj.sample();
        obj.demo();
        obj.childMethod();
    }
}


