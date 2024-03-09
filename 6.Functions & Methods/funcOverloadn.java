public class funcOverloadn {
/*
METHODS:
inbuilt and user defined : two methods in java
inbuilt includes---> Math(pow,sqrt,max), sc.nextInt();
user defined---> factorial,sum,prod

FUNCTION OVERLOADING:
same name , diff parameters...

Function overloading using parameters--->
*/ 
   // func for 2 parameter's sum:
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // // func for 3 parameter's sum:
    // public static int sum(int a, int b,int c){
    //     return a+b+c;
    // }
    

    // Function Overloading using Data Types--->
    public static int sum(int a, int b){
        return a+b;
    }
    
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
         System.out.println(sum(3,7));
        //  System.out.println(sum(1, 4, 5));
        System.out.println(sum(2.3f, 5.4f));
    }
}
