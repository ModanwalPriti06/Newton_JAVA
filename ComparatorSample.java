import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.*;

class Student1{
    int roll_no;
    String name;
    int age;
    Student1(int roll_no, String name, int age){
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;

    }
}
class NameComparator implements Comparator {
    public int compare(Object obj1,Object obj2){
        Student1 s1=(Student1) obj1;
        Student1 s2=(Student1) obj2;
        return s1.name.compareTo(s2.name);
    }

}
public class ComparatorSample {
    public static void main(String[] args) {
        ArrayList<Student1> al=new ArrayList<>();
        al.add(new Student1(1,"Priti",18));
        al.add(new Student1(2,"kirti",16));
        al.add(new Student1(5,"Ak",22));
        al.add(new Student1(12,"shyma",20));
        System.out.println("Sort using name");
        Collections.sort(al,new NameComparator());
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student1 s1=(Student1) itr.next();
            System.out.println(s1.roll_no+" "+s1.name+" "+s1.age);
        }
    }

}
