public class Tiling {
    public static int tilingProblem(int n) {// 2 x n (floor size)
                                            // 4 x n also include the same code)
        // base case
        if(n == 0 || n == 1){
           return 1;
        }
        //kaam
        //vertical choice
      //   int fnm1 = tilingProblem(n-1);

        //hortizontal choice
      //   int fnm2 = tilingProblem(n-2);

      //   int totWays = fnm1 + fnm2;

        return tilingProblem(n-1) + tilingProblem(n-2);

    }
    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean map[]){
      if(idx == str.length()){
         System.out.println(sb);
         return;
      } 

      //kaam : character nikalna
      char currChar = str.charAt(idx);
      // map ka idx aa gya
      if(map[currChar - 'a'] == true){
         //duplicate 
         removeDuplicates(str, idx+1, sb, map);
      } else {
         map[currChar - 'a'] = true;
        removeDuplicates(str, idx+1, sb.append(currChar), map);
      }
    }

    public static int friendsPairing(int n){
      if(n == 1 || n == 2){
         return n;
      }
      //choice
      //single
      // int fnm1 = friendsPairing(n-1);
      
      //pair
      // int fnm2 = friendsPairing(n-2);
      // int pairWays = (n-1) * fnm2;

      //totWays
      // int totWays = fnm1 + pairWays;
      // return totWays;

      return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    
    }
    public static void main(String args[]){
       System.out.println(tilingProblem(5));
       String str = "appnnacollege";
       removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
       System.out.println(friendsPairing(3));
    }
}
