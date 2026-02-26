/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garbageCollection;

/**
 *
 * @author ADMIN
 */
public class GCDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GCDemo obj=new GCDemo();
        obj=null;
        System.gc();
        //nowadays the gc methods are automatically invoked 
        //after programs execution by the objects class
        //for clutter,garbage collection & removal by the JVM
        //--->> we do not need to call it explicitly
        System.out.println("GC requested");
    }
    
}
