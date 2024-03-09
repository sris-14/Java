public class hollowRec{

    /*
      *****
      *   *
      *   *
      *****
       representation like matrix 

       boundary conditions:
       row==1||col==1||row==4||col==1
       then it'll print star in whole column or row.
    */ 

    public static void hollowRectangle(int totRows, int totCols){
        // i---> row and j---> col
        // outer loop
        for(int i=1; i<=totRows; i++){
            // inner - columns
            for(int j=1; j<=totCols; j++){
                // cell - (i,j)
                // boundary conditions
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       hollowRectangle(4, 5);
    }
}