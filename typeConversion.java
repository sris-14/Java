public class typeConversion {
    public static void main(String args[]){
/*
Also know as widening and implicit conversion
Conversion happens when :
a. type compatible (convertable)
b. destination type > source type

byte--> short--> int--> float--> long--> double
*/ 
int a=25;//4 bytes
long b=a;//8 bytes
System.out.println(b);
/* But, yes there can be lossy conversion.
long a =25;
int b=(int)a;
This is known as type casting or narrowing conversion,
explicit conversion
*/ 
long a1=25;
int b1=(int)a1;
System.out.println(b1);

        /* Scanner used for input then;
        float number= sc.nextInt();
        Syso(number);
        */ 

char ch='a'; //'b','c'
int number=ch;
System.out.println(number);        
    }
}
