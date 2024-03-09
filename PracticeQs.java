import java.util.*;

public class PracticeQs {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //1.
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float avg=(a+b+c)/3;
        System.out.println("Average : "+avg);

        //2.
        int side= sc.nextInt();
        System.out.println("area of square is : "+(side*side));

        //3.
        // int $=24;(no error occurred) 
        sc.close();
    }
}
