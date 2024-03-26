
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
 Classes and Objects :                                
 Entities which exist in the real world are called Objects. It could be anything like - pen, watch, animal, etc.                                         
 Group of these entities which we called objects are called Classes. In simple words we can say, when similar types of items get grouped together and forms a collection, then this collection is our class. Class is the blueprint of an object.         
  > Class = attributes (properties) + function (behavior)  
  E.g;                                     
   color : String (blue)                               
   tip : 5 (int)                                      
   setColor(): 
   setTip() : 

```
 public class OOPS{
  public static void main(String args[]){
     Pen p1 = new Pen();
     p1.setColor("Blue");

     //Alternative way : 
     //p1.color = "Yellow";

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
 It include :
 1. Private :
    > can be access within the class
 2. Default :
    > can be access within the class as well as within the package
 3. Protected : 
    > can be access within the class, within package and outside package by subclass only
 4. Public :
    > can be access within the class, within package & outside package   


 Getters and Setter

 Constructor 
 ```
 public class OOPS_class2{
    public static void main(String args[]){
        Student s1 = new Student("srishti");
        System.out.println(s1.name);
      }
}

class Student {
    String name;
    int roll;

    Student(String name){
        this.name = name;
    
    }
}
```  
Running statement inside the constructor. 
This is also an example of non paramterized constructor
```
public class OOPS_class2{
    public static void main(String args[]){
        Student s1 = new Student();
        // System.out.println(s1.name);
      }
}

class Student {
    String name;
    int roll;

    Student(){
       System.out.println("constructor is called...");
    
    }
}
```
Constructor ----- Parameterized Constructor  
&ensp;    |&ensp;|------- Non-Parameterized Constructor   
&ensp;    |------- Copy Constructor

here comes, Non-Paramterized and Paramaterized Constructor
```
public class OOPS_class2{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("srishti");
        Student s3 = new Student(12);
        
      }
}

class Student {
    String name;
    int roll;
    // non paramterized constructor
    Student(){
       System.out.println("constructor is called...");
    }
    // paramterized constructor
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
```
Copy Constructor


```
public class OOPS_class2{
    public static void main(String args[]){
        Student s1 = new Student();
       s1.name = "srishti";
       s1.roll = 92;
       s1.password ="abcd";
       s1.marks[0] = 100;
       s1.marks[1] = 90;
       s1.marks[2] = 80;

       Student s2 = new Student(s1);//copy
       s2.password = "xyz";
       s1.name = "shreya";
       s1.marks[2] = 100;
       for(int i=0; i<3 ; i++){
        System.out.println(s2.marks[i]);
       }
       System.out.println(s2.name);
       System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

// copy constructor
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }


    // non paramterized constructor
    Student(){
       marks = new int[3];
       System.out.println("constructor is called...");
    }


    // paramterized constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}

```

Shallow and deep constructor

```
public class OOPS_class3 {
        public static void main(String args[]){
            Student s1 = new Student();
           s1.name = "srishti";
           s1.roll = 92;
           s1.password ="abcd";
           s1.marks[0] = 100;
           s1.marks[1] = 90;
           s1.marks[2] = 80;
    
           Student s2 = new Student(s1);//copy
           s2.password = "xyz";
           s1.name = "shreya";
           s1.marks[2] = 100;
           for(int i=0; i<3 ; i++){
            System.out.println(s2.marks[i]);
           }
    
        }
}
    
    class Student {
        String name;
        int roll;
        String password;
        int marks[];
    
    // shallow copy constructor
        // Student (Student s1){
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;
        // }/

    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }

    }
    
        Student(){
           marks = new int[3];
           System.out.println("constructor is called...");
        }
    
        Student(String name){
            marks = new int[3];
            this.name = name;
        }
    
        Student(int roll){
            marks = new int[3];
            this.roll = roll;
        }
    }
    
```

Destructor -

```
```


