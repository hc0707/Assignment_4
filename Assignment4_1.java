//WAP to remove Duplicates from a String.

public class Assignment4_1 {
    public static void main(String[] args) {
        String dup = "hello  hi";

        //STORING THE STRING IN ARRAY
        char[] old = new char[dup.length()];
        for (int i = 0; i < old.length; i++) {
            old[i]=dup.charAt(i);
        }

        //---------Logic--------------//
        //Creating an empty array
        char[] next = new char[dup.length()];
        int k=0;

        for (int i = 0; i < old.length; i++) {
            //to chech if the particular elment is already present before
            int j;
            for (j = 0; j<i; j++) {
                if (old[i]==old[j]) {
                    break;
                }
            }

            //if not present then add it to the new array
            if(j==i)
            next[k++]=old[i];
        }

        //converting new array into string and print the Output
        StringBuffer sb = new StringBuffer(next.length);
        for (char c : next) {
            sb.append(c);
        }
        System.out.println(sb);
        
    }
}
