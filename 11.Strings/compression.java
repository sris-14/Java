public class compression {

// using string
    // public static String compress(String str){
    //     String newstr ="";
    //     for(int i=0; i< str.length(); i++){
    //         Integer count = 1;
    //         while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         newstr += str.charAt(i);
    //         if(count > 1){
    //             newstr += count.toString();
    //         }
    //     }
    //     return newstr;
    // }
    

    public static String Compression(String str){
        // using string builder
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
          Integer count =1;
           while( i<str.length() -1 && str.charAt(i)== str.charAt(i+1)){
            count++;
            i++;
           }
           sb.append(str.charAt(i));
           if(count > 1){
            sb.append(count.toString());
           }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.print(Compression(str));
        System.out.println();
        // System.out.println(compress(str));
    }
}
