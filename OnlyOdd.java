import java.util.Arrays;
import java.util.List;

public class OnlyOdd {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 4);
        System.out.println(onlyOddNumbers(list));
    }

    public static boolean onlyOddNumbers(List<Integer> list) {
        return list
                .parallelStream() // parallel stream for faster processing
                .allMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
    }
}
