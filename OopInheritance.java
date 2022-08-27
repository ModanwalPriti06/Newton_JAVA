// class Student{
//    String name;
//    int age;
//    public Student(String name){
//        this.name=name;
//    }
//}
// class Employee extends Student{
//
//     public Employee(String name) {
//         super(name);
//     }
// }

class Apple1{
    public void eat(){
        System.out.println("Parent class eating");
    }
}
class Banana extends Apple1{
    void sale(){
        System.out.println("sale banana");
    }
}
public class OopInheritance {
    public static void main(String[] args) {
        Banana obj=new Banana();
       obj.sale();
       obj.eat();
    }
}
