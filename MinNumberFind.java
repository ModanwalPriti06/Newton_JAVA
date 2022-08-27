import java.util.*;
public class MinNumberFind {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
