abstract class Fruits{
    int cost=100;
    public void display(){
        System.out.print("cost is : "+cost);
    }
}
class Dragon extends Fruits{
    int cost=100;
    public void display(){
        System.out.println("cost is"+cost);

    }
        }
        class Pine extends Fruits{

        }
public class OopAbstraction {
    public static void main(String[] args) {
        Pine obj=new Pine();
        obj.display();
    }
}
