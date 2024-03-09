public class leetcode {
    //find second largest element in an array...

    public static int firstLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int secondLargest(int arr[]){
       int max = firstLargest(arr);
       for(int i=0;i<arr.length;i++){
        if(arr[i] == max){
            arr[i] = Integer.MIN_VALUE;
        }
       }
       int secondLargest = firstLargest(arr);
       return secondLargest;
    }

    public static void main(String args[]){
        int arr[]={7,6,7,3,2,1};
        System.out.print("The second largest element : " + secondLargest(arr));
    }
}
