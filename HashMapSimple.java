import java.util.HashMap;
import java.util.Map;

public class HashMapSimple {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",10);
        map.put("USA",25);
        map.put("China",50);
        System.out.println(map);
        //print foreach loop
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }
        //remove
        map.remove("China");
        System.out.println();

    }
}
