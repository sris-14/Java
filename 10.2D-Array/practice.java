public class practice {
    
    public static int numberofSeven(int arr[][], int target){
        int count =0;
        for(int i =0; i< arr.length; i++){
            for(int j =0; j< arr[0].length; j++){
                if(arr[i][j] == target){
                    count ++;
                }
            }
        }
        return count;
    }

    public static int SumofSecRow(int nums[][]){
       int sum =0;
       for(int i=0; i< nums.length; i++){
        for(int j =0; j< nums[0].length; j++){
            if(i==1){
                sum+= nums[1][j];
            }
            else {
                continue;
            }
        }
       }
       return sum;
    }

    public static void Transpose(int arr[][]){
        int trans[][] = new int[arr[0].length][arr.length];
        for(int i =0; i< arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("Before Transpose : ");
        for(int i =0; i< arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("After Transpose : ");
        for(int i =0; i< trans.length; i++){
            for(int j=0; j< trans[0].length; j++){
                System.out.print(trans[i][j]+" ") ;
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int arr[][] ={{4, 7, 8},
                      {8, 7, 7}};
          
        int target =7;
        System.out.println(numberofSeven(arr, target));
        int nums[][] ={{1, 4, 9},
                       {11, 4, 3},
                       {2, 2, 3}};
        System.out.println(SumofSecRow(nums));   
        Transpose(arr);
                  
    }
}
