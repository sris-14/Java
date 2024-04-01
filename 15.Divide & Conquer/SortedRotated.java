public class SortedRotated {

    //using iterators
    public static int Search(int arr[], int tar, int si, int ei){
        int i = si;
        int j = ei;

        //Base case
        if(i>j){
            return -1;
        }
        int mid = si + (ei - si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        // for(int k=i; k< j ; k++){
            if(arr[i]<=arr[mid]){
                if(arr[i] <= tar && tar <= arr[mid]){
                    j = mid-1;
                } else {
                    i = mid+1;
                }
                mid = i+ (j-i)/2 ;
            } else {
                if(arr[mid] <= tar && tar <=arr[j]){
                    i = mid+1;
                } else {
                    j = mid-1;
                }
                mid = i + (j-i)/2 ;
            }
        // }
     
        return mid;
    }
     //using recursion
    public static int search(int arr[], int tar, int si, int ei){
        //Base Case
        if(si > ei){
            return -1;
        }

        //kaam
        int mid = si + (ei -si)/2;
        
        //case FOUND
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
          //case a : left
          if(arr[si] <= tar && tar<=arr[mid]){
               return search(arr, tar, si, mid-1);
          } else {
             //case b : right
              return search(arr, tar, mid+1, ei);
            }
        } 
        //mid on L2
        else {
         //case c : right
         if(arr[mid] <= tar && tar<=arr[ei]){
            return search(arr, tar, mid+1, ei);
         } else {
            //case d : left
            return search(arr, tar, si, mid-1);
         }
        }

        
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;//output -> 4
        int targetIdx = search(arr, target, 0, arr.length-1);
        System.out.println(targetIdx);
        System.out.println(Search(arr, target, 0, arr.length-1));
    }
}
