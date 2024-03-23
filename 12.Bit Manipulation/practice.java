public class practice {
    public static void main(String args []){
        // swap two numbers using XOR
        int a = 5;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
