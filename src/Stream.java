import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 9, 8, 5, 6, 4, 7, 3));

        // even numbers
        List<Integer> even = list.stream()
                .filter(num -> num %2 ==0)
                .collect(Collectors.toList());
        System.out.println(even);

        //starting with 1
        List<Integer> startsWith1 = list.stream()
                .filter(num -> num.toString().startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(startsWith1);

        //total number of element present
        Integer total = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(total);

        //sort values
        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
