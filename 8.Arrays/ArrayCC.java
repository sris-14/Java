public class ArrayCC{
    public static void main(String args[]){
        int marks[]={68,98,74};
        String fruits[]={"apple","mango","grapes"};
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
       
/*
        Scanner sc= new Scanner(System.in);
        int phy;
        phy=sc.nextInt();

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);


        //update
        marks[1] = marks[1]+1;
        System.out.print("chem :"+marks[1]);
*/ 

    }
}