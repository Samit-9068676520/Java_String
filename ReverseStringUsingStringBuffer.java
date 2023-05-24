package string;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        String input = "java2blog";
        StringBuffer sb = new StringBuffer(input);

        System.out.println(sb.reverse());
    }
}
