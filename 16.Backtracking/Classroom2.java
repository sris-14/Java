public class Classroom2 {
    public static void findSubsets(String str,String ans, int i){
        //Base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }
          System.err.println(ans + " ");
          return;
        }
        //recursion
        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
