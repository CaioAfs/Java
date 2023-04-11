package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        UnaryOperator<Integer> toBinary = n -> Integer.valueOf(Integer.toBinaryString(n));
        Function<Integer,String> inverter = n -> String.valueOf(new StringBuilder(n.toString()).reverse());
        UnaryOperator<String> converter = n -> String.valueOf(Integer.parseInt(n,2));

        //1. Integer para binario
        //2. reveter posicoes de numeross
        //3. converter para decimal

        //1. numero para binario
        nums.stream().map(toBinary).forEach(print);
        //2. reveter posicoes de numeros
        nums.stream().map(toBinary).map(inverter).forEach(print);
        //3. converter para decimal
        nums.stream().map(toBinary).map(inverter).map(converter).forEach(print);

        //Curso

        //Function<String,Integer> inverterCurso = s -> new StringBuilder(s).reverse().toString();
        //nums.stream().map(Integer::toBinaryString).map(inverterCurso).map(converter).forEach(print);

    }
}
