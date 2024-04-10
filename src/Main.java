import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");

        names.remove("Walter");
//        names.remove(0);  => does not work

        System.out.println(names);
        names.clear();
        System.out.println(names.size());
        System.out.println(names.contains("Saul"));
        System.out.println(names.isEmpty());

    }
}