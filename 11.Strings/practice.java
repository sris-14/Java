import java.util.*;
public class practice {

    public static void CountVowels(String str){
        int count = 0;
        for(int i =0; i< str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        System.out.println("Count of Vowels : "+ count);

    }
    public static void main(String args[]){
        // 1.
        // String str="ApnaCollege".replace("l","");
        // System.out.println(str);

        // 2.
        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
         CountVowels(str);
sc.close();
    }
}
