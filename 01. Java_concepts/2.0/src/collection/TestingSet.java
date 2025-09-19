
import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Harsh"));
        System.out.println(names.add("Kumar"));
        System.out.println(names.add("Singh"));
        Utility.print(names);

        System.out.println(names.add("Harsh"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Harsh"));
        System.out.println(names.remove("Kumar"));
        Utility.print(names);
        System.out.println(names.remove("Singh"));
    }
}








