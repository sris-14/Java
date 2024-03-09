import java.util.*;
public class conditional{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Vote and can drive");
        } else {
            System.out.println("Not an adult");
        }
        sc.close();
    }
    
}