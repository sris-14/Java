public class pairs {

    public static void print_pairs(int arr[]){
        int tp=0;
        //2, 4, 6, 8, 10
        for(int i=0; i<arr.length; i++){
            // 4, 6, 8, 10
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i]+","+ arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }


    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        print_pairs(arr);
    }
}
