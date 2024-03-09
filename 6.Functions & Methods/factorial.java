public class factorial {

    public static int factrial(int n){
       int f=1;

       for(int i=1;i<=n;i++){
           f*=i;
       }
       return f;
    }

    public static int binomialCoeff(int n, int r){
        int n_fact=factrial(n);
        int r_fact=factrial(r);
        int nmr_fact=factrial(n-r);
        int binCoeff=n_fact/(r_fact*nmr_fact);
        return binCoeff;
    }
    public static void main(String args[]){
       int n=5;
       System.out.println(factrial(n));
       System.out.println(binomialCoeff(5, 2));
    }
}
