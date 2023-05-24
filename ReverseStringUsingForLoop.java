package string;
public class ReverseStringUsingForLoop{
    public static void main(String[] args) {
        String input="java2blog";
        System.out.println("input string-: "+input);
        String output="";
        for(int i=input.length()-1;i>=0;i--){
            output+=input.charAt(i);
        }
        System.out.println("Reverse output string-: "+output);
    }
}