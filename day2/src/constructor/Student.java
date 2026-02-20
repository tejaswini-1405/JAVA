
package constructor;


public class Student {
    String name;
    int age;
    Student(String n,int a){
        name=n;
        age=a;
    }
    void dispaly(){
        System.out.println(name + " "+age);//cannot call n bcz n & a inside the constructor not abl etom use outside
    }

        public static void main(String[] args) {
        Student obj=new Student("tej",115);
        obj.dispaly();
    }
    
}
