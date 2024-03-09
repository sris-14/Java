public class largestOfThree {
    public static void main(String args[]){
        int a=19;
        int b=8;
        int c=16;
        if(a>=b && a>=c){
            System.out.println("Largest of three is a : "+a);
        } 
        else if(b>=c){
            System.out.println("Largest of three is b : "+b); 
        } else {
            System.out.println("Largest of three is c : "+c);
        }
    }
}
