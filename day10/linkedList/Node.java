package DSA.linear.linkedList;
class LL{
    Node head;
    private int size;
    LL(){
        size=0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){//constructor
            this.data=data;
            this.next=null;//we don't know the address of the next node
            size++;//Increment the size as soon  as a node is created
        }
}
public void printList(){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.data + " --> ");
            curr=curr.next;
        }
    System.out.println("null");
}
public void addFirst(String data){
        //create a new node
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
}
public void addLast(String data){
    //create a new node
    Node newNode=new Node(data);
    //If the list is empty
    if(head==null){
        head=newNode;
        return;
    }
    //if there are multiple, we need to find the last node
    Node last=head;
    while(last.next!=null){
        last=last.next;
    }
    //At the end of this loop, we will stand at the last node
    //Point the last node next pointer to the new node
    last.next=newNode;
}
public void removeFirst(){
        //Empty List-->cannot remove the head node
        if(head==null){
            System.out.println("list is empty.can't delete the head");
            return;
        }
        //for a single node,the head will point to the next(null)
    //for a multiple node,the head will point to the next(head.next)
    head=this.head.next;
}
public void removeLast(){
    //Empty List-->cannot remove the tail node
    if(head==null){
        System.out.println("list is empty.can't delete the tail");
        return;
    }
    //single element in the list
    if(head.next==null){
        head=null;//c/c++ style of code
        size--;
        return;
    }
    //multiple elements in the list
    Node curr=head;
    Node last=head.next;
    while(last.next!=null){
        curr=last;
        last=last.next;
    }
    //the last node will be cleared by the JVM if not used
    //so,we point the seconLast (curr) node to null pointer
    curr.next=null;
    size--;
}
public void removeTarget(String target){
        //empty lis -> cannot remove the target node.
    if(head==null){
        System.out.println("list is empty.can't delete the target");
        return;
    }
    //case : target is the head node itself
    if(head.data.equals(target)){
        head=head.next;
        size--;
        return;
    }
    //case:target is anywhere in the list
    Node prev=null;
    Node curr=head;
    while(curr!=null && !curr.data.equals(target)){
        prev=curr;
        curr=curr.next;
    }
    //do a check to see if the curr pointer is null
    //if its null,the target is not found
    if(curr==null){
        System.out.println("Target not found in the list");
        return;
    }
    prev.next=curr.next;//adjust the previous node & current node
    size--;

}
    public static void main(String[] args) {
        LL sll=new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("we");
        sll.printList();
        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.removeTarget("Learning");
        sll.printList();
        sll.removeTarget("Python");
    }

}
