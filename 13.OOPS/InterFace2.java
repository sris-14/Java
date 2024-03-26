public class InterFace2 {
    public static void main(String args[]){
       Beer b1 = new Beer();
       b1.eat();
    }
}

interface Herbivore{
    void eat();
}
interface Carnivore{
     void eat();
}

class Beer implements Herbivore, Carnivore{
   public void eat(){
        System.out.println("inheritance in interface...");
    }
}