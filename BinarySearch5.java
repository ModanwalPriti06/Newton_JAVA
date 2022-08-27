import java.util.Scanner;
public class BinarySearch5 {
    public static int squareNum(int n){
        int i=0;
        int j= n;
        int ans=0;
        while(i<=j){
            int mid=(i+j)/2;
            ans=mid*mid;
            if(ans==n){
                return mid;
            }
            else if(ans<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the find min index ");
        System.out.println("enter the times");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("enter the squareNum of element");
            int n = sc.nextInt();
            System.out.println(squareNum(n));
        }
    }
}
/**enter the times
 2
 enter the squareNum of element
 25
 5
 enter the squareNum of element
 9
 3*/
