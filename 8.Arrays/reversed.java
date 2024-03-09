public class reversed {

    public static void reverse_Array(int arr[]){
        int first = 0;
        int last = arr.length - 1;
        while(first < last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first ++; 
            last --;
        }

    }

    public static void main(String args[]){
       int arr[] = {1,2,3,4};
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       reverse_Array(arr);
       for(int i=0;i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
    }
}
