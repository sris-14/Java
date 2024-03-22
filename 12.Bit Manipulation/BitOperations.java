public class BitOperations {

    public static int getIthBit(int n, int i){
        int bitMask = 1<< i;
        if(( n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String args[]){
       System.out.println(getIthBit(10, 3));
       System.out.println(setIthBit(11, 0));
    }
}
