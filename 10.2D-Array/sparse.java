public class sparse{
    public static void main(String args[]){
        int rows, col, size;
        int count =0;
        int arr[][]= {{4, 0, 5}, {3, 0, 0},{0, 9, 0}};
        rows = arr.length;
        col = arr[0].length;
        size = rows * col;
        
        for(int i =0; i< rows; i++){
            for(int j =0; j< col; j++){
                if(arr[i][j] == 0){
                  count ++;
                }
            }
        }
        if(count> size/2){
            System.out.println(" IT IS SPARSE MATRIX");
        } else {
            System.out.println("NOT SPARSE");
        }

    }
}