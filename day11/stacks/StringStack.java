package DSA.linear.stacks;

import java.sql.SQLOutput;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[] arr=new String[MAX_SIZE];
    private int top=-1;//stack is initially empty
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    public void push(String data){
        if(isFull()){
            System.out.println("stack overflow.can't add more elements");
            return;
        }
        arr[++top]=data;
        System.out.println("the string: "+ data + "was pushed to stack");
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow. we can't remove the top");
            return null;
        }
        String popped=arr[top--];
        return popped;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack underflow. no elements to display");
            return;
        }
        System.out.println("The stack elements in order [LIFO] are: ");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return top+1;
    }
    public String peek(){
        //intention is to fetch the top elements -> not delete it
        if(isEmpty()){
            System.out.println("Stack underflow.can't retrieve top.");
            return null;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        StringStack stack=new StringStack();
        //stack.pop();
        stack.push("mango");
        stack.push("MuskMelon");
        stack.push("Apple");
        stack.display();
        System.out.println("Top elements: " + stack.peek());
        String popped=stack.pop();
        System.out.println("Popped elements is " + popped);
        stack.display();
        System.out.println("Size of stack: " +stack.size());
    }
}
