import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Harsh", 34);
        map.put("sachin", 100);
        map.put("Dev", 100);
        map.put("Arpit", 0);
        System.out.println(map.size());
        System.out.println(map.get("Harsh"));
        System.out.println(map.containsKey("Sachin"));
        System.out.println(map.containsKey("Dev"));
        System.out.println(map.remove("Arpit"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}









