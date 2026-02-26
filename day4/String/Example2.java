/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

//String is immutable - we cannot change it
// we can just create copies - original string doesn't change
//the concat() method creates a new object-so resukt is ignored 
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="java";
        s.concat("Programming");
        System.out.println(s);
    }
    
}
