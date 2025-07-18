
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // HashMaps = a data structure that stores key-value pairs 
        //            keys are unique , but values can be duplicated
        //            Does not maintain any order , but is memory efficient 
        //            HashMap<key , value>
        //            if we put a duplicate key with a different value it will override the value of the original key

        HashMap<String , Double> map = new HashMap<>(); // we will store strings as the key and doubles as values

        // As always there is a lot of methods to be used with hashmaps
        map.put("orange", 5.5);
        map.put("banana", 6.5);
        map.put("spagetti", 3.5);
        map.put("pizza", 4.5);
        // map.remove("orange");
        // map.clear();
        // System.out.println( map.values());
        for(String key : map.keySet()){// we use .keyset because hashmaps can not be itterated over with an enhanced for loop
            System.err.println(key + " : $" + map.get(key));
        }
        
       
        

    }

}
