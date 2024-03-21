public class upperCase {

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
       return sb.toString();
    }
    public static void main(String args[]){
        String str = "hi , i am srishti";
        System.out.println(toUpperCase(str));
    }
}
