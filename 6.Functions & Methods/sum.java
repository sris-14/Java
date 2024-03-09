import java.util.*;

public class sum {
/*
 parameters pass in the function definition as an input is called :
 formal paramters... and the values which is called while function
 call in the calling statement is called : arguments or actual 
 parameters.
*/ 

    public static int calSum(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        System.out.println("sum :"+calSum(a,b));
        sc.close();
    }
}