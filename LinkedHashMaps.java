import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class LinkedHashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map =new LinkedHashMap<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            map.put(p,map.getOrDefault(p,0)+1);
        }
        System.out.println(map);
    }
}
/**
 10
1 1 1 4 5 2 4 5 1 4
{1=4, 4=3, 5=2, 2=1}
*/
