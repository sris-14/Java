
# JAVA
Kickstart with programming language,Java.                                               
Biolerplate code :


```
public class A {
    public static void main(String args[]){
        //write code
    }
}
```

#How code is running?? 
source code (.java) --> compiler --> ByteCode (.class) --> JVM --> Native Code 


# Variables and DataTypes
>output:                                                                              print 
 println                                                                               "\n"
```
System.out.print("Hello!!");
```

>input:
  next(), nextFloat(), nextline, nextBoolean, nextInt, nextShort, nextByte, nextLong...
```
import java.util.*;


Scanner sc = new Scanner(System.in);
dataType name_var = sc.next();
```

#DataTypes :
> Primitive

> Non-Primitive

# Operators
> Binary

> Unary 

> Ternary

# OOPS 
 Classes and Objects :                                Entities which exist in the real world are called Objects. It could be anything like - pen, watch, animal, etc.                                         Group of these entities which we called objects are called Classes. In simple words we can say, when similar types of items get grouped together and forms a collection, then this collection is our class. Class is the blueprint of an object.          > Class = attributes (properties) + function (behavior)                                        color : String (blue)                               tip : 5 (int)                                       setColor(): 

 setTip()                                         
  ```
 public class OOPS{
  public static void main(String args[]){
     Pen p1 = new Pen();
     p1.setColor("Blue");
     <!-- Alternative way : 
       p1.color = "Yellow"; -->
     System.out.println(p1.color);

     p1.setTip(5);
     System.out.println(p1.tip);
  }
 }

 class Pen{
  String color;
  int tip;

  void setColor(String newColor){
    color = newColor;
  }

  void setTip(int newTip){
    tip = newTip;
  }
 }

  ```

Access Modifier :                                 
 It define who can access the class or objects.   


