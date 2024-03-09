import java.util.*;

public class sum {
    public static void main(String args[]){
        // Scanner class used for taking input
        Scanner sc= new Scanner(System.in);
        
        // String input = sc.next();
        // System.out.println(input);
//for storing spaces
    //    String name=sc.nextLine();
    //    System.out.println(name);

    //    int number=sc.nextInt();
    //    System.out.println(number);

        // calculate sum
         int a= sc.nextInt();
         int b=sc.nextInt();
         int sum=a+b;
         System.out.println("sum = "+sum);

        //for preventing from error :'sc' is never closed
        sc.close();//to remove memory leak
    }
}
