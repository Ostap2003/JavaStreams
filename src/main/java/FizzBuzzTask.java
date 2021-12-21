import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public List<String> fizzBuzzIt(int n) {
        List<Integer> arr = IntStream.range(1, n).boxed().collect(Collectors.toList());
        return arr
                .stream()
                .map(
                    x -> ((x%3 == 0) || (x%5 == 0))
                            ? ((x % 3 == 0 & x % 5 == 0) ? "Fizz Buzz" : (x % 3 == 0) ? "Fizz" : "Buzz")
                            : x.toString())
                .collect(Collectors.toList());
    }
}
