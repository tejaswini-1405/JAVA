/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author ADMIN
 */
public class StringbaseExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] letters={'A','B','C','D'};
        //String name=letters.toString();//wrapper classes
        String name=new String(letters);
        System.out.println(name);
        String jumbled="Teju1Is1From1ISE1B1Section";//consider as array
        //"Teju","Is","From","ISE","B","Section"
        String[] words=jumbled.split("1");
        System.out.println(words[5]);
        for(Object o : words){//Object because we want access any type.
            System.out.print(o+" ");
        }
        System.out.println();
        String data="   SNPSU   ISE   ";
        System.out.println(data.trim());
    }
    
}
