package formatter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NamesFormatter {
    public static String formatNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i / 2 + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Peter", "Alice", "Michael");
        String formattedNames = formatNames(names);
        System.out.println(formattedNames);
    }
}

