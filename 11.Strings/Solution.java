class Solution {
    public int findMaxLength(int[] nums) { 
        int maxlen =0;
        for(int i =0; i< nums.length; i++){
            int ones=0;
            int zeroes = 0;
            for(int j =i; j< nums.length ; j++){
               if(nums[j] == 0){
                   zeroes ++;
               } else {
                   ones ++;
               }
               if(zeroes == ones){
                 maxlen = Math.max(maxlen, j-i+1);
               }

            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        // int nums[] ={1,0,1};
        // findMaxLength(nums);
    }
}