/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalKeyword;


public class Example2 {
    {
    System.out.println("IIB2");
    }

    //If we don't intialize a final variable,
    //where is  it initialized? = constructor
    final int x;
     //If we don't intialize a static final variable,
    //where is  it initialized? = constructor
    static final int y;
    Example2(){
        x=200;
    }

   
    public static void main(String[] args) {
        //obj is mandatory for IIB output
        Example2 obj=new Example2();
        
    }
    static{ //static outside still we get output
        y=10;
        System.out.println("start");
        System.out.println("DB-start");
        System.out.println("Internet-Start");
        System.out.println("Load files");
    }
    {
        System.out.println("IIB1");
    }
}