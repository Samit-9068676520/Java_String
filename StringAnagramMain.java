package string;

public class StringAnagramMain {
    public static void main(String[] args) {
        String word = "java2blog";
        String anagram = "aj2vabgol";
 
        System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingStringMethods(word, anagram));
    }

    private static boolean  isAnagramUsingStringMethods(String word, String anagram){
        if (word.length()!=anagram.length()){
            return false;
        }
        for (int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int index=anagram.indexOf(ch);
            if (index!=-1){
                anagram=anagram.substring(0, index)+anagram.substring(index+1, anagram.length());
            }else{
                return false;
            }
        }
        return anagram.isEmpty();
    }
}
