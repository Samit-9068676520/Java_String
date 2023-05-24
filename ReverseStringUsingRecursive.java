package string;

public class ReverseStringUsingRecursive {
    public static void main(String[] args) {
        System.out.println("===First Way==");
        ReverseStringUsingRecursive recursive = new ReverseStringUsingRecursive();
        System.out.println(recursive.recursiveReverse("Samit"));

        System.out.println("====Second Way===");
        ReverseStringUsingRecursive recursive2 = new ReverseStringUsingRecursive();
        System.out.println(recursive2.recursiveReverseFromBegining("Samit"));

    }

    public String recursiveReverse(String orig) {
        if (orig.length() == 1) {
            return orig;
        }
       // return orig.charAt(orig.length() - 1) + recursiveReverse(orig.substring(0, orig.length() - 1));
       char lastChar=orig.charAt(orig.length() - 1);
       String reversedString=recursiveReverse(orig.substring(0, orig.length() - 1));
       return lastChar+reversedString;
    }

    public String recursiveReverseFromBegining(String orig) {
        if (orig.length()==1){
            return orig;
        }
        char firstChar=orig.charAt(0);
        String reverdeString=recursiveReverseFromBegining(orig.substring(1,orig.length()));
        return reverdeString+firstChar;
    }
}
