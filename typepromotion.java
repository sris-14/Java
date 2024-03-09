// import java.util.*;

public class typepromotion {

    /*
    Type promotion: operation 
    1.Java auatomatically promotes each byte, short, or char 
    operand to int when evaluating an expression.
    char a='a'
    short b=50
    a--> int
    b--> int
    2.If one operand is long, float or double the whole 
    expression is promoted to long, float, or double respectively. 
     bda datatype jaisa hoga result come accordingly
     eg: small containers water can contained by a large container. 
    */ 
   public static void main(String args[]){
    //1.
    // char a = 'a';
    // char b = 'b';
    // System.out.println((int)b);
    // System.out.println((int)a);
    // System.out.println(b-a);

    //2.
    int a =10;
    float b=20.25f;
    long c=25;
    double d=30;
    double ans= a+b+c+d ;
    System.out.println(ans);
   }

}
