import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisUm = n -> n + 2;
        UnaryOperator<Integer> vezesCinco = n -> n * 5;

        int resultado = maisUm.andThen(vezesCinco).apply(5);
        System.out.println(resultado);

        UnaryOperator<String> feliz = s -> s + " :D ";
        UnaryOperator<String> triste = s -> s + " :C ";

        String carinhas = feliz.andThen(triste).apply(":/ ");
        System.out.println(carinhas);

    }
}
