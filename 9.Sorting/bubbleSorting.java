public class bubbleSorting{

     public static void bubbleSort(int arr[]){
         for(int i =0; i< arr.length-1;i++){
            int swap =0;
            for(int j= 0; j< arr.length-1-i; j++){
               if(arr[j] > arr[j+1]){
                  int temp= arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] =temp;
                  swap ++;
               }
               if(swap ==0){
                  break;
               }
            }
            
         }
     }

   //   TC : O(n^2)
     public static void printArr(int arr[]){
         for(int i =0;i< arr.length; i++){
            System.out.print(arr[i]+" ");
         }
     }

     public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        printArr(arr);
     }
}