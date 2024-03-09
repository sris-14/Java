import java.util.*;
public class oddEven {
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       int  num=sc.nextInt();
       if(num%2==0){
        System.out.println("Even no.");
       } else {
        System.out.println("Odd no");
       }

       sc.close();
    }
}
