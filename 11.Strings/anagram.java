import java.util.Arrays;

public class anagram {

    public static void main(String args[]){
       String str1 = "race";
       String str2 = "care";

       // convert strings to lowercase.
       //why so? so that we don't have to check 
       // separately for lower & uppercase
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

       //check - if lengths are same
       if(str1.length() == str2.length()){
        // convert str into char array
        char str1arr[] = str1.toCharArray();
        char str2arr[] = str2.toCharArray();

        //  sort the char array
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);

        //if sorted are same or identical then
        // the strings are anagram
        
        boolean result = Arrays.equals(str1arr, str2arr);
        if(result){
            System.out.println(str1 + " and " + str2 +" are anagram of each other.");
        } else {
            System.out.println(str1 +" and "+ str2+ " are not anagram of each other.");
        }
       } else {
        // lengths are not equal. hence, not anagram.
            System.out.println(str1 +" and "+ str2+ " are not anagram of each other.");
       }
    }
}
