import java.util.*;;
public class Qs {
    //  Write a program that reads a set of integers, and
    //  then print sum of even and even and odd integers.

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int evenSum=0;
        int oddSum=0;
        int choice;
       do{
            System.out.println("enter number : ");
            n=sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            } else {
                oddSum+=n;
            }
            System.out.println("want to continue? yes->1 or no->0");
            choice=sc.nextInt();
        }while(choice==1);

        System.out.println("sum of even numbers: "+evenSum);
        System.out.println("sum of odd numbers: "+oddSum);

        sc.close();
    }
}
