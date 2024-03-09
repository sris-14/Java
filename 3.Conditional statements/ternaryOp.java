import java.util.*;
public class ternaryOp {
    public static void main(String args[]){
        //largest
        int a=3;
        int b=8;
        int largest=(a>b)?a:b;
        System.out.println("largest : "+largest);

        //Odd-Even
        int num=10;
        String Num=(num%2==0)?"Even":"Odd";
        System.out.println("Number is : "+Num);

        //Student pass or fail
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String res=(marks>=33)?"PASS":"FAIL";
        System.out.println("Student obtained "+marks+" marks, So he/she is "+res);

        sc.close();
    }
}
