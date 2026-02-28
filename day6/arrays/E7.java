package arrays;
class Student{
    String name;
    int USN;
}
class Intern{
    String name;
    int id;
    Intern(String name,int id){
        this.name=name;
        this.id=id;
    }
}
//Array of objects {Students Objects}
public class E7 {
    public static void main(String[] args) {
        Student[] students =new Student[3];
        students[0]=new Student();
        students[0].name="Teju";
        students[0].USN=115;
        System.out.println(students[0].name + " " + students[0].USN);
        Intern[] interns=new Intern[]{
                new Intern("Teju", 101),
                new Intern("Varsh", 102),
                new Intern("Harsh", 103)

        };
        //the data type is the class itself
        for(Intern i: interns){
            System.out.println(i.name + " " + i.id);
        }
        //for(Student s: students){
          //  System.out.println(s.name + " "+ s.USN);
        //}
    }
}
