import java.util.*;

public class Main {
    public static void main(String[] args) {

        // I don't want duplicates
        //I don't care about the order

        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");

        names.remove("Walter");
//        names.remove(0);  => does not work

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Saul"));
        System.out.println(names.isEmpty());

        //One method to print out

        for (String name : names){
            System.out.println(name);
        }

        System.out.println("Another method");

        //Another method to pint it out

        names.forEach(System.out::println);

        //Another method
        System.out.println("Another method");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>(numberList);

        System.out.println(numberSet);




    }
}