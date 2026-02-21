package Oops;


public class Animal2 {
    void print(){
        System.out.println("sound");
    }

}
class dog extends Animal2{

   void sound(){
       System.out.println("boww");
   }
    
}
class puppy extends dog{
    void display(){
        System.out.println("puppy class");
    }

    
    public static void main(String[] args) {
        puppy ob=new puppy();
        ob.display();//puppy
        ob.sound();//dog
        ob.print();//Animal  
    }
    
}
