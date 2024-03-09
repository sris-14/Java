// import java.util.*;
public class controlStat {
    public static void main(String args[]){

        //Break statement--->
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop");

// enter number till multiple of 10
        // Scanner sc= new Scanner(System.in);
    
        // do{
        //     System.out.print("Enter number : ");
        //     int number=sc.nextInt();

        //     if(number%10==0){
        //         break;
        //     }
        //     System.out.println(number);
        // } while(true);
        // sc.close(); 


   ///to skip iteration ----> continue statement
        for(int i=1;i<=5;i++){
           if(i==3){
              continue;
           }
           System.out.println(i);
        }     

       

    // display all numbers except multiples of 10
        do {
            System.out.print("enter number : ");
            // int number=sc.nextInt();
            int number=20;
            if(number%10==0){
                continue;
            } 
            System.out.println("number was :"+number);
            
        } while (true); 
        
    }
}
