import java.util.*;
import java.io.*;

class Node1{
    int val;
    Node next;
    public Node1(int val){
        this.val = val;
        this.next = null;
    }
}

public class MidValueLinkList {
    public static void print(Node head){
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }

    static Node head;
    static Node tail;
    public static void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
    public static int cntNode(Node head){
        int cnt=0;
        Node cur = head;
        while(cur!=null){
            cnt++;
            cur = cur.next;
        }
        return cnt;
    }

    public static int findMid(Node head){
        int cnt = cntNode(head);
        int mid=0;
        if(cnt%2==0){
            mid = cnt/2;
        }
        else{
            mid = (cnt+1)/2;
        }
        Node cur = head;
        while(--mid>0){
            cur = cur.next;
        }
        return cur.val;
    }

    public static int recurCntNode(Node head){
        // base cond
        if(head == null){
            return 0;
        }
        // main logic
        return 1+recurCntNode(head.next);
    }

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            insertLast(p);
        }
        // System.out.println(findMid(head));
        System.out.println(recurCntNode(head));
    }
}

