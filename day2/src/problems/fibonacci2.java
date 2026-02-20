
package problems;


public class fibonacci2 {
    void fibonacci(int n){
    int a=0;
    int b=1;
    for(int i=1;i<=n;i++){
    System.out.println(a + " ");
    int c=a+b;
    a=b;
    b=c;
}
    }
    

    
    public static void main(String[] args) {
        fibonacci2 ob=new fibonacci2();
        ob.fibonacci(7);
        
    }
        
    }
    

