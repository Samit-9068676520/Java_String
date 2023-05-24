package string;

import java.util.Arrays;

public class StringAnagramUsingSorting {
    public static void main(String[] args) {
        String word = "java2blog";
        String anagram = "aj2vabgol";
 
        System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingArraySort(word, anagram));
    }

    public static boolean isAnagramUsingArraySort(String word, String anagram){
        return sortedString(word).equals(sortedString(anagram));
    }
        
    public static String sortedString(String str){
        char[] chArr=str.toCharArray();
        Arrays.sort(chArr);
        return String.valueOf(chArr);
    }
}
