/*Given a string formula representing a chemical formula, return the count of each atom.
        The atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.
        One or more digits representing that element's count may follow if the count is greater than 1. If the count is 1, no digits will follow.
        For example, "H2O" and "H2O2" are possible, but "H1O2" is impossible.

        Input: K4(ON(SO3)2)2
        Output: K4N2O14S4
 **/
import java.util.*;
import java.io.*;
import java.util.Stack;
public class ChemistryFormula {
    public static String find(String s) {
        Stack<Map<String, Integer>> stk = new Stack<>();
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (c == '(') {
                stk.push(map);
                map = new HashMap<>();
            } else if (c == ')') {
                int val = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    val = val * 10 + (s.charAt(i++) - '0');
                }
                if (val == 0) {
                    val = 1;
                }
                if (stk.size() > 0) {
                    Map<String, Integer> tmp = map;
                    map = stk.pop();
                    for (String key : tmp.keySet()) {
                        map.put(key, map.getOrDefault(key, 0) + tmp.get(key) * val);
                    }
                }
            } else {
                int start = i - 1;
                while (i < s.length() && Character.isLowerCase(s.charAt(i))) {
                    i++;
                }
                String elem = s.substring(start, i);

                int val = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    val = val * 10 + (s.charAt(i++) - '0');
                }
                if (val == 0) {
                    val = 1;
                }

                map.put(elem, val);
            }
        }
        List<String> tmp = new ArrayList<>(map.keySet());
        Collections.sort(tmp);
        String sb = "";
        for (String val : tmp) {
            sb = sb + (val);
            if (map.get(val) > 1) {
                sb = sb + map.get(val);
            }
        }
        // System.out.println(map);
        return sb;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(find(str));
    }
}


