//WAP to print Duplicates characters from the String.

public class Assignment4_2 {
    public static void main(String[] args) {
        
        String dup = "abcadc";

        //STORING THE STRING IN ARRAY
        char[] old = new char[dup.length()];
        for (int i = 0; i < old.length; i++) {
            old[i]=dup.charAt(i);
        }

        //---------Logic--------------//
        //Creating an empty array
        
        System.out.println("Following are the duplicates present in string "+dup+":");
        for (int i = 0; i < old.length; i++) {
            //to chech if the particular elment is already present before
            int j;
            for (j = 0; j<i; j++) {
                if (old[i]==old[j]) {
                    break;
                }
            }

            //Printing the duplicate characters
            if(j!=i)
            System.out.println(old[i]);
        }

        //Printing the duplicate characters
        
    }
             
}
