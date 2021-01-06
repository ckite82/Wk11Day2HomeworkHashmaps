// HashMapDemo.java
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> countriesInfo = new HashMap<String, Integer>();

        countriesInfo.put("UK", 64100000);
        countriesInfo.put("Germany", 80620000);
        countriesInfo.put("France", 66030000);
        countriesInfo.put("Japan", 127300000);

        System.out.println(countriesInfo.get("Japan"));
    }
}