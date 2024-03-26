public class Class8 {
    public static void main(String args[]){
       Calculator calc = new Calculator();
       System.out.println(calc.sum(1, 2));
       System.out.println(calc.sum(2.4f, 5.2f));
       System.out.println(calc.sum(1,2,3));
    }
}

// Polymorphism : Compile Time Polymorphism(Static)
// Method Overloading / Function Overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
