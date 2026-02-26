/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops.composition;
class Engine{
    void start(){
        System.out.println("engine starts");
    }
}

public class Car {
    private Engine engine;
    Car(){
        engine=new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("car is empty");
    }
    public static void main(String[] args){
        Car car=new Car();
        car.drive();
    }
    
}
