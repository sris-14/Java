public class linearSearch {

    public static int Linear_Search(String Arr[], String key_ele){
        for(int i=0; i<Arr.length; i++){
            if(Arr[i] == key_ele){
                return i;
            }
        }
        return -1;
    }
    
    public static int linear_Search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        int key = 10;
        //string type array
        String Arr[]= {"mango", "chips", "icecream", "vanilla", "juice", "shake"};
        String key_ele="icecream";
        
        int index = linear_Search(arr, key);
        if(index == -1){
            System.out.print("KEY NOT FOUND");
        } else {
            System.out.print("KEY FOUND AT INDEX : "+ index);
        }
        System.out.println();
// element to be find in string Arr[] 
        int indx = Linear_Search(Arr, key_ele);
        if(indx == -1){
            System.out.print("KEY NOT FOUND");
        } else {
            System.out.print("FOUND AT INDEX : "+indx);
        }
    }
}
