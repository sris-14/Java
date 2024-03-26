public class Class6 {
    public static void main(String args[]){
       Bird birdy = new Bird();
       birdy.breath();
       birdy.fly();
    }
}
// Hierarchial Inheritace
class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
