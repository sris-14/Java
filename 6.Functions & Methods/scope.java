public class scope {

    // Method Scope :
    /*
    System.out.println(s);---> error as not declared within the scope .
    The value can't be printed before declaration of the variable.
      int s=45;
      System.out.println(s);
      Similarly, if same thing happen in another function...
    */ 

    //Block Scope :
    /*
    variable can be used where they are declared
    like :
    psvm(){
        int s=45;
    }
    syso(s); ---> here , error occur 
    eg: for loop,...
    */  
    // Class Scope :
    // It include access modifiers. 

    public static void main(String args[]){
      for(int i=0;i<=5;i++){
        System.out.println(i);
      }
      int i=10;
      System.err.println(i);
    }
}
