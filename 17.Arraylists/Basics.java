import java.util.ArrayList;

public class Basics{
    public static void main(String args[]){
        // ClassName objectName = new Classroom
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();
        
        // add operations :
        list1.add(1); //O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1,9); //O(n)
        list2.add("e");
        list2.add("ring");

        list3.add(0.5>0.3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        //get operations : O(1)
        // int element = list1.get(2);
        // System.out.println(element);

        //remove element : O(n)
        // list1.remove(3);
        // System.out.println(list1);

        //set element at index : O(n)

        // list1.set(2,10);
        // System.out.println(list1);

        //contains element : O(n)

        // System.out.println(list1.contains(1));
        // System.out.println(list2.contains("r"));

    }
}