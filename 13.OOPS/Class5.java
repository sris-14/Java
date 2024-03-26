public class Class5 {

    public static void main(String args[]){
        Dog bolt = new Dog();
        bolt.eat();
        bolt.legs = 4;
        System.out.println(bolt.legs);
    }
}
// Multi level inheritance
class Animal{
    String color;

    void eat(){
       System.out.println("eats"); 
    }

    void breath(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
   int legs;
}

class Dog extends Mammal{
   String breed;
}
