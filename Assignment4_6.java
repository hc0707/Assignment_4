//WAP to implement Pangram Checking with least inbuilt methods being used.

public class Assignment4_6 {
    public static void main(String[] args) {
        String s ="The five boxing wizards jump quickly";
        pangram(s);
    }

    static void pangram(String s){
        //Storing the string withou space in array in lower case and 
        
        int len=s.length();
        char c;
            
        char[] ch = new char[len];
        for (int i = 0; i < len; i++) {
            c=s.charAt(i);
            if(c>='A'&&c<='Z'){
                c+=32;
                ch[i]=c;
            }
            else if(c!=32)    
                ch[i]=c;
        }
        //creating new character array of length 26
        char[] next = new char[26];
        int k;
        int i;
        for (i = 0; i < ch.length; i++) {
            if(ch[i]!=0){
                k=ch[i]-97;
                next[k]=ch[i];
            }
        }
        //Checking the new character array if every index is filled or not
        for (i = 0; i < next.length; i++) {
            if (next[i]==0) {
                break;
            }
        }
        if(i==next.length)
            System.out.println("The given string is pangram");
        else
            System.out.println("The given string is not pangram");
        
    }
}
