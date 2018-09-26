import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> params = Arrays.asList(args);
        params.forEach(param -> System.out.println(param));
    }
}
