public class fastExpo {
    public static int FastExpo(int a, int n){
        // a^n
        int ans = 1;
        while(n>0){
            if((n&1) != 0){
                // check LSB
                ans =ans * a;
                // here a is the power
            }
            // updating a
            a = a* a;
            // right shifting by a bit
            n= n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
         System.out.println(FastExpo(3,5));
    }
}
