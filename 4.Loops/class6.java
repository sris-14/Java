import java.util.*;
public class class6 {
    // Reverse of a number
    /*
    10899--> 99801
    10899%10=9 (for last digit)
    10899/10=1089 (for removing last digit)

    9*10
    */ 
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      int rev=0;
      // while(number>0){
      //   int lastDigit=number%10;
      //   System.out.print(lastDigit+"\t");
      //   number=number/10;
      // }
      // System.out.println();
      while(number>0){
        int lastDigit=number%10;
        rev=(rev*10)+lastDigit;
        number=number/10;
      }
      System.out.println(rev);

      sc.close();
    }
}
