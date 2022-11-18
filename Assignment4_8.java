//WAP to find the maximum occurring character in a String.

public class Assignment4_8 {
    public static void main(String[] args) {
        String str = "hahahah";

        //STORING THE STRING IN ARRAY
        char[] old = new char[str.length()];
        for (int i = 0; i < old.length; i++) {
            old[i]=str.charAt(i);
        }

        //---------Logic--------------//
        //Creating an empty array
        int max = 1;
        char ch=' ';
        for (int i = 0; i < old.length; i++) {
        //to chech if the particular elment is already present before
            int count=1;//to store the occurence
            for (int j = 0; j<i; j++) {

                if (old[i]==old[j]) {
                    count++;
                }
            }
            if (max<count) {
                max=count;
                ch=old[i];
            }
            
        }
        if (max==1)
        System.out.println("The string "+ str +" is unique string");
        else
        System.out.println("the most occuring char in string " +str+ " is " +ch+ " It occurs " +max+ " times."  );
    }
}
