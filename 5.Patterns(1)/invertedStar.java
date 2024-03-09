public class invertedStar {
    public static void main(String args[]){
        for(int lines=5;lines>1;lines--){
            for(int star=1;star<lines;star++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second method
        /*
        int n=4;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        */ 
    }
}
