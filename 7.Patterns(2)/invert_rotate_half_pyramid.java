public class invert_rotate_half_pyramid {

    public static void invertedRotatedPyramid(int totRows, int totCols){
           for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
               if((i+j)>=5){
                System.out.print("*");
               } else {
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }

    /*
    output :
       *
      **
     ***
    ****
    */ 

    public static void main(String args[]){
        invertedRotatedPyramid(4, 4);
    }
}
