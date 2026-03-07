//Demonstrate the use of final keyword with variables, methods, and classes.
package assignment2.advanceJava;
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
class Parent {
    final int value = 100;
    final void show() {
        System.out.println("This is a final method.");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Value of final variable: " + value);
    }
}

public class problem5 {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
        obj.display();

        FinalClass fc = new FinalClass();
        fc.display();
    }

}
