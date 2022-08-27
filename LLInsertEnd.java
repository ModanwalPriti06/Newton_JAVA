import java.util.*;
import java.io.*;
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class LLInsertEnd {
    public static void print(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
static Node head;
static Node tail;
    public static void insertLast(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail=node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int p=sc.nextInt();
            insertLast(p);
        }
        print(head);
    }
}
/*Input 
4
4 3 2 1
output
1 2 3 4*/


