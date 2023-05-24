package string;

import java.util.HashSet;

public class ToCheckStringContainsUniqueOrNotUsingHashSet {
    public static void main(String[] args) {

        System.out.println("First Way");
        System.out.println("java2blog has all unique chars : " + hasAllUniqueChars("java2blog"));
        System.out.println("Apple has all unique chars : " + hasAllUniqueChars("apple"));
        System.out.println("index has all unique chars : " + hasAllUniqueChars("index"));
        System.out.println("world has all unique chars : " + hasAllUniqueChars("world"));

        System.out.println("Second Way");

        System.out.println("java2blog has all unique chars : " + hasAllUniqueChars2("java2blog"));
        System.out.println("Apple has all unique chars : " + hasAllUniqueChars2("apple"));
        System.out.println("index has all unique chars : " + hasAllUniqueChars2("index"));
        System.out.println("world has all unique chars : " + hasAllUniqueChars2("world"));

        System.out.println("Third Way");

        System.out.println("java2blog has all unique chars : " + hasAllUniqueCharsUsingAsciiValue("java2blog"));
        System.out.println("Apple has all unique chars : " + hasAllUniqueCharsUsingAsciiValue("apple"));
        System.out.println("index has all unique chars : " + hasAllUniqueCharsUsingAsciiValue("index"));
        System.out.println("world has all unique chars : " + hasAllUniqueCharsUsingAsciiValue("world"));
    }

    public static boolean hasAllUniqueChars(String str) {
        HashSet<Character> alphaSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!alphaSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAllUniqueChars2(String word) {

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) != word.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasAllUniqueCharsUsingAsciiValue(String word) {
        boolean[] charMap=new boolean[26];

        for (int i=0;i<word.length();i++){
            int index=(int)word.toUpperCase().charAt(i)-65;
            if (charMap[index]){
                return false;
            }else{
                charMap[index]=true;
            }
        }
        return true;
    }
}
