/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

/**
 *
 * @author ADMIN
 */
public class Vehicle {
    void speed(){
        System.out.println("vehicle have different speed range" );
    }
    void speed(int maxSpeed){
        System.out.println("maximum speed of the vehicle is "+maxSpeed);
    }
}
class car extends Vehicle{
    void speed(String mode){
        System.out.println("car is running in " + mode + "mode");
    }

    
    public static void main(String[] args) {
        car c=new car();
        c.speed(" sports ");
        c.speed(200);
        c.speed();        
    }
    
}
