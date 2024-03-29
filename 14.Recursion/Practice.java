public class Practice {

    
    //1.
    public static void occurOfElement(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
           System.out.print(i + " ");
        }
        occurOfElement(arr, key, i+1);
   }

   //2.
   public static void NumToStr(int n){
    String digits[] ={"zero", "one", "two", "three", "four", 
"five", "six", "seven", "eight", "nine"};
     if(n == 0){
        return;
     }
     int lastDigit = n % 10;
     NumToStr(n/10);
     System.out.print(digits[lastDigit] + " ");
    
   }

   //3.
   public static int lengthOfStr(String str){
   
      if(str.length() == 0){
        return 0;
      }
      return lengthOfStr(str.substring(1))+1;
     
   }

   //4. 
   public static int countSubstr(String str, int i, int j, int n){
    if(n == 1){
        return 1;
    }
    if(n <= 0){
        return 0;
    }
    int res = countSubstr(str, i+1, j, n-1) + countSubstr(str, i, j-1, n-1) - 
    countSubstr(str, i+1, j-1, n-2);

    if(str.charAt(i) == str.charAt(j)){
        res ++;
    }
    return res;
   }

   //5. 
   public static void TowerofHanoi(int n, String src, String helper ,String disk){
    if(n == 1){
        System.out.println("transfer disk " + n + " from " + src +" to" + disk);
        return;
    }
    TowerofHanoi(n-1, src, helper, disk);
    System.out.println("transfer disk " + n+" from " +src +" to "+ helper);
    TowerofHanoi(n-1, src, helper, disk);
   }
   public static void main(String args[]){
       int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
       int key = 2;
       occurOfElement(arr, key, 0);
       System.out.println();
       NumToStr(1997);
       System.out.println();
       System.out.println(lengthOfStr("abcde"));
       String str = "abcab";
       System.out.println(countSubstr(str, 0, str.length() -1, str.length()));
       int n = 4;
       TowerofHanoi(n, "A", "B", "C");
   }
}
