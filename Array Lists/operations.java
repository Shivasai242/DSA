 import java.util.ArrayList;
public class operations {
    public static void main(String args[]) {
        //Java Collection Framework
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9); //O(n)
        


        System.out.println(list);



        //get operation - O(1)
        int element = list.get(2);
        System.out.println(element);



        // //delete
        // list.remove(2);
        // System.out.println(list);

        // //set
        // list.set(2, 10);
        // System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        
    }
}

