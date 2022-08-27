import java.util.*;
import java.io.*;
class Nod{
    int val;
    Node next;
    public Nod(int val){
        this.val=val;
        this.next=null;
    }
}
public class LinkedList {
    public static Node insertHead(Node head,int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        return head;
    }
    //print the linklist
    public static void print(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int p=sc.nextInt();
            head=insertHead(head,p);
        }
        print(head);
    }
}
/*Input
4
4 3 2 1
output
1 2 3 4*/

