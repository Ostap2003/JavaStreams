import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupWordsTask g = new GroupWordsTask();
        List<String> arr = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(g.groupIt(arr));
    }
}
