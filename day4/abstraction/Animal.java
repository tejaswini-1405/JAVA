
package abstraction;


abstract class Animal {
  //Normal or concrete methods
  //abstract methods
    void eat(){
        System.out.println("animals eat some food");
    }
    //this method cannot have a body
    //it will be implemented in the child classes
    abstract void run();
    //if an abstract class has only abstract methods -it is 100% abstraction
    //if it has even 1 normal method - it is not 100%
    
        
    }
class cat extends Animal{
    @Override
    void run(){
        System.out.println("cats runs fast");
    }
}
class cheetah extends Animal{
    @Override
    void run(){
        System.out.println("Cheetah runs very fast.");
    }
    
}
class Demo{
    public static void main(String args[]){
        cat c=new cat();
        cheetah ch=new cheetah();
        c.eat();
        c.run();
        ch.eat();
        ch.run();
 
    }
}
    
