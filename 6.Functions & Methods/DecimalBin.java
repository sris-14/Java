public class DecimalBin {

    public static void DectoBin(int n){
        int myNum = n;
        int bin=0;
        int rem;
        int pow=0;
        while(n>0){
            rem=n%2;
            bin=bin+rem*(int)(Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+myNum+" = "+bin);
    }

    public static void main(String args[]){
        DectoBin(10);
    }
}
