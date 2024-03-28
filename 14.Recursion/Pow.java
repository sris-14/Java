public class Pow {
    // X to the power n
    public static int Optimizedpower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = Optimizedpower(x, n/2);
        // here we call function once hence it forms complexity
        //  O(logn)
        int halfPowerSq = halfPower * halfPower;
        // int halfPowerSq = Optimizedpower(x, n/2) * Optimizedpower(x, n/2);
        // this above expression forms O(n) complexity as it inclues
        // function calls two times.
        if(n % 2 != 0){
            halfPowerSq = x* halfPowerSq;
        }
        return halfPowerSq;
    }
    
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        return x*pow(x, n-1);
        // explanation:
        // int xnm1 = pow(x, n-1);
        // int xn = x* xnm1;
        // return xn;
    }
    public static void main(String args[]){
       System.out.println(pow(2, 5));
       System.out.println(Optimizedpower(2, 5));
    }
}
