package Maps;

import javax.swing.text.html.parser.Entity;
import java.net.Inet4Address;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Gaurav");
        map.put(2,"Rajesh");
        map.put(3,"Rohan");
        map.put(2,"Suman");

        System.out.println(map);
        Set<Integer> keys = map.keySet();
        // return the set of keys and it will unique not any dublicate
//        System.out.println();

//        Collections<String> values = map.values();
//        System.out.println(values);
        map.remove(10);
        map.remove(2);
        System.out.println(map);

        System.out.println(map.get(0));
        System.out.println(map.get(1));

//        Set<Entry< Integer  , String>> entries = map.entrySet();
//        for(Map.Entry<Integer,String> entry : entries){
//            System.out.println(entry.getkey() + " "+entry.getvalue());
        }
}
