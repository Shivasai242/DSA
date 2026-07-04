import java.util.*;
public class Insert {
    public static void main(String args[]){
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Inset  --O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

    }
}