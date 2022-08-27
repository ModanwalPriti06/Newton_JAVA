class Parent{
    public Parent() {
        System.out.println("called Parent");

    }
}
class Child1 extends Parent {
    public Child1() {
        System.out.print("child1 class");
    }
}
class Child2 extends Parent {
    public Child2() {
        System.out.print("child2 class");
    }
}


public class OopsHierchyInheritance {
    public static void main(String[] args) {
        Parent obj=new Child1();
        //Parent obj=new Child1();
    }
}
