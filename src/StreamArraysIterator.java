import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArraysIterator {

    public static void main(String[] args) {
        int []x = {1,2,7,9, 10};
        List<Integer> list = Arrays.stream(x).boxed().collect(Collectors.toList());
        //find inex of 9
        int index = IntStream.range(0, x.length).filter(i -> x[i] == 9).findFirst().orElse(-1);
        System.out.println(index);
        // Sum of digit values
        String valueWithDigit = "ar10 kuma25 sha36 nia12d";
        int sum = Arrays.stream(valueWithDigit.split(" ")).filter(p -> p.matches("\\d+")).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);


        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .skip(2)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Get second largest value
        int[] array = {545, 23, 92, 1, 200, 532};
        int secondLargest = Arrays.stream(array).sorted().limit(array.length-1).skip(array.length-2).findFirst().getAsInt();
               // .skip(array.length-2).findFirst().getAsInt();
        System.out.println(secondLargest);

    }
}
