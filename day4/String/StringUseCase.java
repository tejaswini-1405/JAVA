/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author ADMIN
 */
public class StringUseCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message="order confirmed";
        System.out.println(message);
        message=message +"- ID:115";
        System.out.println(message);
        //message=message+"-ID :102;
        //System.out.println(message);
        
    }
    
}
/*
String is immutable
String in SCP(string constant pool)
every modification creates a new object-> Heap memory
good for read only data
*/
