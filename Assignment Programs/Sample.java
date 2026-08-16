package basics;
class Parent {

    public int a = 10;       // public
    private int b = 20;      // private
    protected int c = 30;    // protected
    int d = 40;              // default

    void showParent() {
        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

class Child extends Parent {

    void showChild() {
        System.out.println("Public: " + a);
        // System.out.println("Private: " + b); // Error
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

public class Sample {
    public static void main(String[] args) {

        Parent p = new Parent();

        System.out.println("Public: " + p.a);
        // System.out.println("Private: " + p.b); // Error
        System.out.println("Protected: " + p.c);
        System.out.println("Default: " + p.d);

        Child ch = new Child();
        ch.showChild();
    }
}

