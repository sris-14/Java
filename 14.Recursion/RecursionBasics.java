public class RecursionBasics {
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n -1);
        System.out.print(n+" ");
       
    }
    public static void printDec(int n){
        if(n ==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }
    public static int printFact(int n){
        if(n == 0){
            return 1;
        }
       int fnm1 = printFact(n-1);
       int fn = n* printFact(n-1);
       return fn;
    }
    public static int printSumOfn(int n){
        if(n == 0){
            return 1;
        }
        int sumnm1 = printSumOfn(n-1);
        int sumn = n+ sumnm1;
        return sumn; 
    }
    public static void main(String args[]){
       
        int n = 5;
        printDec(n);
        printInc(n);
        System.out.println();
        System.out.println("Factorial : " + printFact(n));
        System.out.print(printSumOfn(n));
    }
}