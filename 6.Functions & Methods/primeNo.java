public class primeNo {
/*
1st method:
n--> prime---> 1,n
for(i=2 to n-1)-->(n%i==0) --if yes toh not prime else prime
*/ 
//only for n>=2
public static boolean isPrime(int n){
   //corner cases
   //2
   if(n==2){
    return true;
   }
    for(int i=2;i<=n-1;i++){
        if(n%i==0){//completely dividing

            return false;
        }
    }
    return true;
} 

//OPTIMIZED METHOD://
/*
Math.sqrt(n)
*/ 
    public static boolean Prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isPrime(3));
        System.out.println(Prime(4));
    }
}
