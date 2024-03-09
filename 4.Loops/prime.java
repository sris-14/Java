import java.util.*;
public class prime {
    /*
      Prime no : n = a*b
              so here, n= 1*n or n*1
              see the unique multiple    
              n= under-root(n) * under-root(n)
              eg:
               12=1*12 |                   12%1==0
                  2*6  | unique values     12%2==0
                  3*4  |                   12%3==0
                  4*3                      12%4==0
                  6*2                      12%6==0
                  12*1                     12%12==0
               
              12---> 2 to 11    
              for (i=2 to n-1){
                if n%i==0
                  not prime
                prime  
              }

              more optimized form 
              for(i=2 to under-root(n))
    */

   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // while(num>0){
        //     if(num==2){
        //         System.out.println("Prime no");
        //     }
        //     if(num%2!=0){
        //         System.out.println("Prime no");
        //         break;
        //     } else {
        //         System.out.println("Not a Prime no");
        //         break;
        //     }
        // }


        if(num==2){
            System.out.println("n is prime");
        } else {
            boolean isPrime=true;
        // for(int i=2;i<num-1;i++){
        //      if(num%i==0){ // n is amultiple of i(i not equal to 1 or n)
        //         isPrime=false;
        //      }
        //  }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){ // n is amultiple of i(i not equal to 1 or n)
               isPrime=false;
            }
        }
         if(isPrime==true){
            System.out.println("num is Prime");
         } else {
            System.out.println("n is not prime");
         }
        }
        

        sc.close();
   }  
}
