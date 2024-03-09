import java.util.*;
public class class3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int counter =1;
        while(counter <=range){
            System.out.print(counter+" ");
            counter+=1;
        }
        System.out.println();

        sc.close();
    }
}
