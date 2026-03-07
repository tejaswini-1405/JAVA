//Write a program to demonstrate static variables and static methods.
package assignment2.advanceJava;
class StaticExample {

    static int count = 0;

    StaticExample() {
        count++;
    }
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}
public class Problem6 {
    public static void main(String[] args) {

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        // Calling static method
        StaticExample.displayCount();
    }
}
