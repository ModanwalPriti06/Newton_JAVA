import java.util.*;
import java.io.*;

class NodeStk{
    Node next;
    int val;
    public NodeStk(int val){
        this.val=val;
        this.next=null;
    }
}
class CustomStack{
    Node head;
    public CustomStack(){
        head=null;
    }
    public void push(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    public int pop(){
     if(head==null){
         return -1;
     }
     Node cur=head;
     head=head.next;
     cur.next=null;
     return cur.val;
    }
    public int peek(){
        if(head==null){
            return -1;
        }
        else{
            return head.val;
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomStack stk = new CustomStack();
        stk.push(1);
        stk.push(5);
        stk.push(3);
        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }
}
