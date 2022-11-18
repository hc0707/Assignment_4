//WAP to check if “2552” is palindrome or not.

public class Assignment4_3 {

    static void palindrome(String s){
        String rev="";

        for (int i = s.length()-1; i>=0; i--) {
            rev=rev+s.charAt(i);
        }

        if(s.equals(rev))
        System.out.println("string "+ s + " is palindrome");

        else
        System.out.println("string "+ s + " is not palindrome");
    }
    public static void main(String[] args) {
        String str="2552";
        palindrome(str);
    }
}
