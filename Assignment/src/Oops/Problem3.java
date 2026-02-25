
package Oops;

class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Problem3 {
    public static void main(String[] args) {

        Shape s1 = new Circle();     
        Shape s2 = new Rectangle();  

        s1.draw();   
        s2.draw();   
    }
}
