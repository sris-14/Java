public class largestr {
    
    public static void main(String args[]){
        String fruits[] ={"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            /*
            here largest have "apple" 
            when i =0, fruits[i]="apple"
            largest = fruits[0] as .compareTos gives 0
            when i=1, fruits[1] = "mango"
            largest.comapreTo(fruits[1]) give -ve
            str1< str2 i.e. apple < mango
            hence largest = mango
             */ 
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        // TC: O(x*N)
        System.out.println(largest);
    }
}
