import java.util.Arrays;
import java.util.Scanner;

public class FindAreaQuick {
    public static int findMaxArea(int[] arr) {
        int i=0;
        int j= arr.length-1;
        int area=0;
        while(i<j){
            int len=(j-i);
            int bre=Math.min(arr[i],arr[j]);
            area=Math.max(area,len*bre);
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxArea(arr));

    }
}
