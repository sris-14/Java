
import java.util.*;

public class Basic{

    // for finding the largest and smallest in array.
    public static int largest(int matrix[][]){
        int n = matrix.length;
        int m =matrix[0].length;
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i =0; i< n; i++){
            for(int j=0; j< m; j++){
               if(matrix[i][j] > largest){
                largest = matrix[i][j];
               }
               if(matrix[i][j] < smallest){
                smallest = matrix[i][j];
                
               }
            }
        }
        System.out.println("smallest element : "+ smallest);
        return largest;
    }

    public static boolean search(int matrix[][], int key){
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at index("+i+","+j+")");
                    return true;
                }
            }
            System.out.println();
        } 
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int [3][3];
        int n = matrix.length, m= matrix[0].length;
         // taking input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n;i++){
            for(int j =0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
            
        }
        // ouput
        for(int i=0; i<n;i++){
            for(int j =0; j<m; j++){
                System.out.print(matrix[i][j] +
                " ");
            }
            System.out.println();
        } 
        search(matrix, 4);
        System.out.println("largest element : "+largest(matrix));

        sc.close();
    }


}