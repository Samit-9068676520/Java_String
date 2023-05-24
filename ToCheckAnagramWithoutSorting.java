package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToCheckAnagramWithoutSorting {
    public static void main(String[] args) {
        System.out.println(toCheckAnagram("SamIt","Samit"));
    }

    private static boolean toCheckAnagram(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < input1.length(); i++) {
            if (map1.get(input1.charAt(i)) == null) {
                map1.put(input1.charAt(i), 1);
            } else {
                map1.put(input1.charAt(i), map1.get(input1.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < input2.length(); i++) {
            if (map2.get(input2.charAt(i)) == null) {
                map2.put(input2.charAt(i), 1);
            } else {
                map2.put(input2.charAt(i), map2.get(input2.charAt(i)) + 1);
            }
        }
        Set<Character> chars=map1.keySet();
        for (Character ch:chars){
            int a=map1.get(ch);
            if (map2.get(ch)==null){
                return false;
            }
            int b=map2.get(ch);
            if (a!=b){
                return false;
            }
        }
        return true;
    }
}
