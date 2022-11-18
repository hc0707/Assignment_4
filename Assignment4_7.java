//WAP to find if String contains all unique characters.

public class Assignment4_7 {
    public static void main(String[] args) {
        String str = "abcd12ef";
        //STORING THE STRING IN ARRAY

        char[] old = new char[str.length()];
        for (int i = 0; i < old.length; i++) {
            old[i]=str.charAt(i);
        }

        //---------Logic--------------//
        
        boolean flag=false;
        loop:{
            for (int i = 0; i < old.length; i++) {
            //to chech if the particular elment is already present before
                for (int j = 0; j<i; j++) {
                    if (old[i]==old[j]) {
                        flag=true;
                        break loop;
                    }
                }
            }
        }
        if (flag) 
        System.out.println("The string " + str +" does not contain unique characters");
        else    
        System.out.println("The string " + str +" contains all unique characters");
        
        
    }
}
