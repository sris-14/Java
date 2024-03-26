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
