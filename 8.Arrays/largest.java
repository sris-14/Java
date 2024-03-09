public class largest {

     public static int largest_inArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("MIN ELEMENT IN ARRAY : " + min);
        return max;
     }

    public static void main(String args[]){
        int arr[] = {2,16,4,0,27,8,9};
        System.out.print("MAX ELEMENT IN ARRAY : "+ largest_inArray(arr));
    }
}
