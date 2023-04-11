package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTreino {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;

        Stream<String> langs = Stream.of("Java", "php", "C", "C#", "js\n");

        langs.forEach(print);

        String[] maisLangs = {"phyton", "Lisp", "Pear", "GO \n"};

        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs,2,4).forEach(print);

        List<String> outrasLangs = Arrays.asList(".", "..", "...", "....", "\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0,n -> n + 1).forEach(print);



    }
}
