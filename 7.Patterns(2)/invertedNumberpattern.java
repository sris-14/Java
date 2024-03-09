public class invertedNumberpattern {
    
    public static void inverted_HalfPyramid(int totRows, int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if((i+j)<=6){
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /* 
    output :
    12345
    1234
    123
    12
    1
    */ 

    public static void main(String args[]){
         inverted_HalfPyramid(5, 5);
    }
}
