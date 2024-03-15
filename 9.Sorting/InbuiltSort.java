import java.util.Arrays;
// import java.util.Collections;
public class InbuiltSort {

    public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
    public static void main(String args[]){
        int arr[] ={5, 7, 2, 4, 1, 3};
        Arrays.sort(arr);
        printArr(arr);

    }
}
