import java.util.*;

public class input {
    public static void main(String args[]){
         Scanner sc= new Scanner (System.in);
//true-false
         Boolean bool= sc.nextBoolean();
         System.out.println(bool);

         Short val=sc.nextShort();
         System.out.println(val);

         Long num=sc.nextLong();
         System.out.println(num);

         sc.close();
    }
}
