package string;

public class FindAllSubsString {
    public static void main(String[] args) {
        String str="abc";
        System.out.println("All substring of abc are:");
        for (int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }   
}
