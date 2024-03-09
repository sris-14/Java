public class nestedLoops{
    public static void main(String args[]){
        //Star pattern
        /*
        1st way--->
        for(int line=1;line<=-4;line++){
            for(int star=1;star<=lines;star++){
                syso("*");
            }
            sysoln();
        }
        */ 
        for(int lines=0;lines<4;lines++){
            // for printing star
            for(int star=0;star<(lines+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}