package basics;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

// 1. SINGLE INHERITANCE
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 2. MULTILEVEL INHERITANCE
class Grandparent {
    void house() {
        System.out.println("Grandparent has a house");
    }
}

class Parent extends Grandparent {
    void car() {
        System.out.println("Parent has a car");
    }
}

class Child extends Parent {
    void bike() {
        System.out.println("Child has a bike");
    }
}

// 3. HIERARCHICAL INHERITANCE
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void circle() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape {
    void rectangle() {
        System.out.println("This is a rectangle");
    }
}

// 4. MULTIPLE INHERITANCE USING INTERFACES
class Student implements Printable, Showable {
    public void print() {
        System.out.println("Student can print");
    }

    public void show() {
        System.out.println("Student can show");
    }
}

// 5. HYBRID INHERITANCE
class Person {
    void speak() {
        System.out.println("Person speaks");
    }
}

class Teacher extends Person implements Printable {
    public void print() {
        System.out.println("Teacher prints notes");
    }
}

class StudentTeacher extends Teacher implements Showable {
    public void show() {
        System.out.println("StudentTeacher shows information");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        // Single inheritance test
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel inheritance test
        Child c = new Child();
        c.house();
        c.car();
        c.bike();

        // Hierarchical inheritance test
        Circle ci = new Circle();
        Rectangle r = new Rectangle();
        ci.draw();
        ci.circle();
        r.draw();
        r.rectangle();

        // Multiple inheritance using interfaces test
        Student s = new Student();
        s.print();
        s.show();

        // Hybrid inheritance test
        StudentTeacher st = new StudentTeacher();
        st.speak();
        st.print();
        st.show();
    }
}
