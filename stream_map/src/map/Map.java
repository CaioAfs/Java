package map;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

        List<String> marcas = Arrays.asList("BmW", "AuDi", "HoNdA");
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n-> n + "!!!";

        marcas.stream().map(m -> m.toUpperCase() ).forEach(print);
        marcas.stream().map(m -> m.toLowerCase()).forEach(print);

        //composicao
        marcas.stream().map(maiuscula).map(grito).forEach(print);
        marcas.stream().map(maiuscula).map(grito).map(grito).forEach(print);







    }
}
