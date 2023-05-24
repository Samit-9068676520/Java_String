package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out
                .println("First non repeated character for String analogy is : "
                        + getNonRepeatedCharacter("analogy"));
        System.out
                .println("First non repeated character for String easiest is : "
                        + getNonRepeatedCharacter("easiest"));
    }

    public static Character getNonRepeatedCharacter(String str) {
        LinkedHashMap<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (countCharacters.get(str.charAt(i)) == null) {
                countCharacters.put(str.charAt(i), 1);
            } else {
                countCharacters.put(str.charAt(i), countCharacters.get(str.charAt(i)) + 1);
            }
        }
        for (Entry<Character, Integer> e : countCharacters.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return null;
    }
}
