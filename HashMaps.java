import java.util.Map;
import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Map<Integer, Integer> map =new HashMap<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            map.put(p,map.getOrDefault(p,0)+1);

        }

        //--------------------- function in map-----------------
//        map.put(1,2);
//      map.put(1,3);
//      map.putIfAbsent(1,10);
//      System.out.println(map.containsKey(10));
//      System.out.println(map.getOrDefault(10,0));     //0 output (0 qkyoki primitive type hai)
//      System.out.println(map.get(10));           //null output  (object type null hai isie)
        System.out.println(map);

    }
}
/**Input: 10
 1 1 1 4 5 2 2 4 5 1*/