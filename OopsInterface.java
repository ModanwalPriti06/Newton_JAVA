import java.util.Scanner;

interface User{
    public void displayName();
}
interface Person extends User{

}
class Child implements User{
    public void displayName(){
        System.out.println("Priti Modanwal");
    }

}
public class OopsInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        User user=new Child() ;
        user.displayName();


    }
}
