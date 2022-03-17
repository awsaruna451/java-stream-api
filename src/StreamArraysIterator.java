import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamArraysIterator {

    public static void main(String[] args) {
        int []x = {1,2,7,9, 10};
        List<Integer> list = Arrays.stream(x).boxed().collect(Collectors.toList());
        //find inex of 9
        int index = IntStream.range(0, x.length).filter(i -> x[i] == 9).findFirst().orElse(-1);
        System.out.println(index);
    }
}
