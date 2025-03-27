package day5;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Add
        map.put("Raj", 68);
        map.put("Manish", 78);
        map.put("Amisha", 67);
        map.put("Puneet", 98);
        map.put("Atul", 78);
        map.put("Pooja", 78);
        map.put("Ankit", 78);
        map.put("Ankita", 78);
        // map.put(null, 78);
        // map.put("Pooja", 58);
        System.out.println(map);
        // get
        System.out.println(map.get("Ankit"));
        System.out.println(map.get("Anku"));
        // // remove
        System.out.println(map.remove("Anku"));
        System.out.println(map.remove("Ankit"));
        System.out.println(map);
        // // Conatins
        System.out.println(map.containsKey("kunal"));
        System.out.println(map.containsKey("Raj"));
        System.out.println(map.containsValue(78));

        // keySet
        for(String key : map.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();
        // values

        for(int val : map.values()){
            System.out.print(val + " ");
        }

    }

}
