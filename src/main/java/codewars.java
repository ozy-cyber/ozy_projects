import java.util.ArrayList;
import java.util.List;

public class codewars {

    public static void main(String[] args) {

        System.out.println("Hellow world");

        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

//Parallel Execution

        names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

    }
}
