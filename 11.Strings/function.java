public class function {

    public static void compare(String s1, String s2, String s3){
    //    if(s1 == s2){
    //     System.out.println("Strings are equal");
    //    } else {
    //     System.out.println("Strings are not equal");
    //    }
    //    if(s1 == s3){
    //     System.out.println("Strings are equal");
    //    } else {
    //     System.out.println("Strings are not equal");
    //    }

    // String function : equals() for comparison
    if(s1.equals(s3)){
        System.out.println("Strings are equal");
    } else{
        System.out.println("String are not equal");
    }
    }

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i =0; i< ei; i++){
            substr += str.charAt(i);
        }
        return substr;

    }
    public static void main(String args[]){
        // String s1 = "Rahul";
        // String s2 = "Rahul";
        // String s3 = new String("Rahul");
        // compare(s1, s2, s3);
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        // System.out.println(substring(str, 0, 5));
    }
}
