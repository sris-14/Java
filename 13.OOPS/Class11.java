public class Class11 {
    public static void main(String args[]){
    //    Horse h = new Horse();
    //    h.eat();
    //    h.walk();
    //    System.out.println(h.color);

    //    Chick c = new Chick();
    //    c.eat();
    //    c.walk();
    //    System.out.println(c.color);

    Mustang myHorse = new Mustang();
    // Animal -> Horse -> Mustang
       
    }
}


abstract class Animal {
    String color;
    // Constructor
     Animal(){
       System.out.println("animal constructor called...");
     }    

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called...");
    }
    
    void changeColor(){
        color = "dark brown";
    }
    
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called...");
    }
}


// class Chick extends Animal {
//     Chick(){
//         System.out.println("Chick comstructor called...");
//     }
//     void changeColor(){
//         color = "yellow";
//     }

//     void walk(){
//         System.out.println("walk on 2 legs");
//     }
// }