//WAP to count the number of consonants, vowels, special characters in a String

public class Assignment4_4 {
    public static void main(String[] args) {
        String str="a*b!c#ei@slo";
        count(str);
    }

static void count(String s){

    int vowelCount=0;
    char[] vowels= {'a','e','i','o','u'};
    int specialCount=0;
    char[] special= {'!','@','#','$','*','_'};

    for (int i = 0; i < s.length(); i++) {
        //vowels checking

        for (char c : vowels) {
            if (s.charAt(i)==c) {
                vowelCount++;
                break;
            }
        }
        //special character checking

        for (char c : special) {
            if (s.charAt(i)==c) {
                specialCount++;
                break;
            }
        }
    }
    
    System.out.println("The numbers of vowels present is           : "+vowelCount);
    System.out.println("The numbers of special character present is: "+specialCount);
    System.out.println("The numbers of consonats present is        : "+(s.length()-vowelCount-specialCount));
}
}
