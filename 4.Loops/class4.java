import java.util.*;

public class class4 {
    //sum of first n natural no
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int i=1;
      while(i<=n){
        sum+=i;
        i+=1;
      }
      System.out.println("sum of n number:"+sum);

      sc.close();
    }
}
