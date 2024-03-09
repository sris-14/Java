import java.util.*;
public class practice {

    public static void isPalindrome(int num){
        int rev = 0;
        int Num = num;
        while(Num>0){
        int rem = Num%10;
            rev = rev*10 + rem;
            Num = Num/10;
        }
        System.out.println(rev);
        if(num==rev){
            System.out.print("yes , palindrome.");
        } else {
            System.out.print("no, it's not a palindrome");
        }
    }

    public static void sumOfdigits(int n){
        int sum = 0;
        int lastdigit = 0;
        while(n>0){
            lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
        }
        System.out.println(sum);
    }
    
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("The number is : ");
        int n = sc.nextInt();
        // System.out.print("The ouput : "+ isEven(n));
        isPalindrome(n);
        // sumOfdigits(n);
        sc.close();
    }
}
