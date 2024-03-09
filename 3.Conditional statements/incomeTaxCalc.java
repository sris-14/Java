import java.util.*;
public class incomeTaxCalc {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int income =sc.nextInt();
        int tax;
        if(income<500000){
           tax=(0*income)/100;
           System.out.println("Tax : "+tax+"rs");
        } 
        else if(income>=500000 && income <1000000) {
           tax=(20*income)/100;
           System.out.println("Tax : "+tax+"rs");
        } else {
            tax=(30*income)/100;
            System.out.println("Tax : "+tax+"rs");
        }
        sc.close();
    }
}
