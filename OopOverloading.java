class Student{
    public void Name(String name){
        System.out.println(name);
    }
    public void Name(String fName,String lName){
        System.out.println(fName+" "+lName);
    }
}
public class OopOverloading {
    public static void main(String[] args) {
        Student std=new Student();
        std.Name("priti");
        std.Name("priti","Modanwal");
    }
}
