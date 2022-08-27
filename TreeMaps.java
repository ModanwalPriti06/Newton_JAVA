import java.util.*;
public class TreeMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            map.put(p,map.getOrDefault(p,0)+1);

        }
        System.out.println(map);

    }
}

