public class solidrhombus {

    public static void solidRhombus(int n){
        // outer
        for(int i=1;i<=5;i++){
            //inner
            //spaces - (n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //star - n
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
       solidRhombus(5);
    }
}
