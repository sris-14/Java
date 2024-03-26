public class OOPS{

    // access specifier: static
    
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

// blueprint of pen
class Pen{
    String color;
    int tip;

    // getter -
    String getColor(){
        return this.color;
    }
   
    // the below are setters : setting the color
    void setColor(String newColor){
        color = newColor;
    }
//  setter which set the tip of a pen
    void setTip(int newTip){
        tip= newTip;
    }
}

