import java.util.*;

public class Basics {
    public static void main(String args[]){
        // char arr[] ={'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Strings are IMMUTABLE (not changeable)

        Scanner sc = new Scanner(System.in);
        String name;
        name =sc.nextLine();
        System.out.println(name);
// String length
        System.out.println(name.length());
        // string concatination
        String firstName = "Srishti";
        String lastName = "Shukla";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName.charAt(0));
        sc.close();
    }
}
