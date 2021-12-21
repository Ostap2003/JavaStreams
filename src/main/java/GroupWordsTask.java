import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public Map<Character, Long> groupIt(List<String> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(x -> x.getKey(), val -> val.getValue()
                        .stream()
                        .flatMap(str -> Arrays.stream(str.split("")))
                        .filter(ch -> ch.equals(val.getKey().toString()))
                        .count()));
    }
}
