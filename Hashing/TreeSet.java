public class TreeSet {
        public static void main(String[] args) {
        java.util.HashSet<String> cities = new java.util.HashSet<>();
            cities.add("Delhi");
            cities.add("Mumbai");
            cities.add("Noida");
            cities.add("Bengaluru");

            System.out.println(cities);

        java.util.LinkedHashSet<String> lhs = new java.util.LinkedHashSet<>();
            lhs.add("Delhi");
            lhs.add("Mumbai");
            lhs.add("Noida");
            lhs.add("Bengaluru");
            
            System.out.println(lhs);

        java.util.TreeSet<String> ts = new java.util.TreeSet<>();
            ts.add("Delhi");
            ts.add("Mumbai");
            ts.add("Noida");
            ts.add("Bengaluru");
            
            System.out.println(ts);



    }
    
}
