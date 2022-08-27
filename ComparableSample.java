
import java.util.*;
class Student2 implements Comparable<Student2> {
    int roll_no;
    String name;
    int age;
    Student2(int roll_no, String name, int age){
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;

    }
 public int compareTo(Student2 st){
        if(age==st.age){
            return 0;

        }
        else if(age>st.age){
            return 1;
        }
        else{
            return -1;
        }
 }
}
public class ComparableSample {
    public static void main(String[] args) {
        ArrayList<Student2> al=new ArrayList<Student2>();
        al.add(new Student2(101,"Priti",23));
        al.add(new Student2(102,"summer",32));
        Collections.sort(al);
        for(Student2 st:al){
            System.out.println(st.roll_no+" "+st.name+" "+st.age);

        }

    }
}
