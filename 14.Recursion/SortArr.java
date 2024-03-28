public class SortArr {
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length -1){
            return true;
        }
        if(arr[i] > arr[i+1]){
           return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurrence(int arr[] , int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurrence(arr, key, i+1);
    }

    public static int lastOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastOccurrence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }

        //check with self
        // if(arr[i] == key){
        //     return i;
        // }
        return isfound;
    }
    public static void main(String args[]){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOccurrence(arr, 5, 0));
        System.out.println(lastOccurrence(arr, 5, 0));
    }
}
