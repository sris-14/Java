public class floyd_triangle {

    public static void floydTriangle(int totRows, int totCols){
        int count=1;
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        floydTriangle(5, 5);
    }
}
