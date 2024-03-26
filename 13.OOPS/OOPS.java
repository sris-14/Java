public class OOPS{

    // access specifier: static
    
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
       
        System.out.println(p1.getColor());
        // p1.setTip(5);
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
    
}

// blueprint of pen
class Pen{
    private String color;
    private int tip;

    // getter -
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // the below are setters : setting the color
    void setColor(String newColor){
        this.color = newColor;
    }
//  setter which set the tip of a pen
    void setTip(int newTip){
        tip= newTip;
    }
}

