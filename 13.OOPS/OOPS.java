public class OOPS{

    // access specifier: static
    // by convention main function should be static and public 
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object called p1
        // p1.setColor("Blue");
        p1.color = "Purple";
        System.out.println(p1.color);
        // p1.setTip(5);
        p1.tip = 5;
        System.out.println(p1.tip);
    }
    
}
// Blueprint of class

// multiple classes can be made
// by convention classes name start with capital letter

// blueprint of pen
class Pen{
    String color;
    int tip;
   
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip= newTip;
    }
}

// blueprint of student
class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }
}