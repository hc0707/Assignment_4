//WAP to implement Anagram Checking least inbuilt methods being used.

public class Assignment4_5 {
    public static void main(String[] args) {
        String s1="STar";
        String s2="rAts";
        anagram(s1, s2);
    }

    static void anagram(String s1,String s2){
        if (s1.length()!=s2.length()) {
            System.out.println("The given strings are not anagram");
        }

        else{
            //storing the strings in arrays in lower case
            int len=s1.length();
            char c;
            char[] c1 = new char[len];
            for (int i = 0; i < len; i++) {
                c=s1.charAt(i);
                if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z'){
                    c+=32;
                    c1[i]=c;
                }
                else    
                    c1[i]=c;
            }
            
            char[] c2 = new char[len];
            for (int i = 0; i < len; i++) {
                c=s2.charAt(i);
                if(s2.charAt(i)>='A'&&s2.charAt(i)<='Z'){
                    c+=32;
                    c2[i]=c;
                }
                else
                    c2[i]=c;
            }

            //sorting the arrays using bubble sort

            char temp;
            for (int i = 0; i < len-1; i++) {
                for (int j = i+1; j < len; j++) {
                    if(c1[j]<c1[i]){
                        temp=c1[j];
                        c1[j]=c1[i];
                        c1[i]=temp;
                    }
                }
            }

            for (int i = 0; i < len-1; i++) {
                for (int j = i+1; j < len; j++) {
                    if(c2[j]<c2[i]){
                        temp=c2[j];
                        c2[j]=c2[i];
                        c2[i]=temp;
                    }
                }
            }

            //comparing the string arrays
            int i;
            for (i = 0; i < len; i++) {
                if (c1[i]!=c2[i]) 
                    break;
            }
            if(i==len)
            System.out.println("The given strings are anagram");
            else
            System.out.println("The given strings are not anagram");
            c1.toString();
            c2.toString();
            System.out.println(c1);
            System.out.println(c2);
        }
    }
}
