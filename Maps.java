import java.util.HashMap;


public class Maps {
    public static void main(String[] args) {
    // maps
    // happy paths

        // creating a HashMap with a variable types of Strings for keys and values
        HashMap map1 = new HashMap();
        map1.put("key1", "A");
        map1.put("key2", "B");
        map1.put("key3", "C");
        map1.put("key4", "D");
        System.out.println(map1);

        // gets the value for the key you entered
        System.out.println(map1.get("key1"));

        // loops through all the keys
        map1.keySet().forEach((s) -> {
            System.out.println(s);
        });

        // loops through all the values
        map1.values().forEach((s) -> {
            System.out.println(s);
        });

        // puts the keys and values together through a loop
        map1.entrySet().forEach((s) -> {
            System.out.println(s);
        });

        // removes key3 from the HashMap
        map1.remove("key3");
        System.out.println(map1);

    // nasty paths

        // prints out null cause nothing is there
        try {
            System.out.println(map1.get(7));
        } catch (Exception e) {
        }

        // removes an element that is not there
        try {
            System.out.println(map1.remove(99));
        } catch (Exception e) {
        }

        // prints out null cause nothing is there
        try {
            System.out.println(map1.remove(map1.containsKey(77)));
        } catch (Exception e) {
        }

        // what if either or are null for put? - It just puts in null like a key, and puts whatever you put in.
        try {
            map1.put(null, null);
            map1.put("key1", null);
            map1.put(null, "E");
            map1.put(234234, 2343);
            System.out.println(map1);
        } catch (Exception e) {
        }


    }
}