public class Class4{
   public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
   }
}

class Animal{
   String color;
   void eat(){
      System.out.println("eats");
   }

   void breathe(){
      System.out.println("breathes");
   }
}

// Derived class or subclass
class Fish extends Animal{
   int fins;
void swims(){
   System.out.println("swims in water");
}
}
