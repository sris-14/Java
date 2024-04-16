import java.util.*;

public class MultidArraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list.add(1); list.add(2);
        // mainList.add(list);
        // list1.add(3); list1.add(4); list1.add(5);
        // mainList.add(list1);
    
        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainList);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1 ; i<=5; i++){
            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(3);
        list2.remove(2);

        System.out.println(mainList);

        //nested loops
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}