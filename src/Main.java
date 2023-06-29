import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("yamaguchi");
        names.add("yamada");
        names.add("noguchi");
        names.add("ito");
        names.add("yamaguchi");

        names.stream().distinct().filter(name -> name.contains("y")).sorted().forEach(name -> System.out.println(name));
    }
}