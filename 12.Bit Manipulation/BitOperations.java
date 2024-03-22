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
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<< i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0 ){
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }
    public static void main(String args[]){
       System.out.println("getIthBit : "+getIthBit(10, 3));
       System.out.println("setIthBit : "+setIthBit(10, 2));
       System.out.println("clearIthBit : "+clearIthBit(10, 1));

       System.out.println("upadte ith bit : " +updateIthBit(0, 0, 0));
    }
}
