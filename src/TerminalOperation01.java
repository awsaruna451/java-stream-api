import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation01 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 3, 6);
        int min = list.stream().min(Comparator.comparing(i-> i)).get(); // minvalue
        int max = list.stream().max(Comparator.comparing(i-> i)).get(); // max value
        double avg = list.stream().mapToDouble(i->i).average().getAsDouble();  // average

        System.out.println(min);

    }
}
