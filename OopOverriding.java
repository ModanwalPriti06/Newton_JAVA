abstract class Fruit{
    abstract void apple();
    abstract void pineApple();
    }
    class Vegetable extends Fruit{
    @Override
    public void apple(){
        System.out.println("Apple");
    }
    @Override
        public void pineApple(){
            System.out.println("pineApple");
        }

    }
public class OopOverriding {
    public static void main(String[] args) {
   Fruit obj=new Vegetable();
   obj.apple();
   obj.pineApple();
    }
}
