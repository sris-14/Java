public class InsertionSort {

    public static void insertionSort(int arr[]){
      for(int i =1; i< arr.length ; i++){
        int curr = arr[i];
        int prev = i-1 ;
        while(prev >=0 && arr[prev] > curr){
            arr[prev +1] = arr[prev];
            prev --;
        }
        //insertion
        arr[prev +1 ] = curr;
      }
    }
// TC : O(n^2)
    public static void printArr(int arr[]){
        for(int i =0; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 9};
        insertionSort(arr);
        printArr(arr);
    }
}
