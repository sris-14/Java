public class MaxSubarraySum3 {

    public static void kadanes(int arr[]){
      int ms = Integer.MIN_VALUE;
      int cs = 0;
   
      // for(int i =0 ; i< arr.length;i++){
      //   if(arr[i]<0){
      //     if(arr[i]> ms){
      //       ms = arr[i];
      //     }
      //   }

      //   else{
      //     for(int j=0;j<arr.length;j++){
      //       cs = cs + arr[j];
      //       if(cs < 0){
      //         cs = 0;
      //       }
      //       ms = Math.max(cs , ms);
      //     }
    
            
      // }


      for(int i=0;i<arr.length;i++){
        cs = cs + arr[i];
        if(cs > ms){
          ms = cs;
        }
        if(cs < 0){
          cs = 0;
        }
        // ms = Math.max(cs , ms);
      // }
      }
      System.out.println("Our maximum subarray sum is : "+ms);
    }

    public static void main(String args[]){
     int arr[] = {-2, -3, -4, -2, -3};
    // int arr[] = {5, 4, -1, 7, 8};
    // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
     kadanes(arr);
    }
}
