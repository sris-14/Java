public class BinaryDec {

    public static void BintoDec(int n){
        int myNum=n;
        int dec=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%10;
            dec=dec+(int)(lastdigit*(Math.pow(2,pow)));
            pow++;
            n=n/10;
        }
        System.out.println("decimal form of "+myNum+" = "+dec);
    }

    public static void main(String args[]){
        BintoDec(101);
    }
}
