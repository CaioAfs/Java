import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer,String> parImpar = numero -> numero % 2 == 0 ? numero+ ":" + " é Par" : numero +":" + " é Impar";

        Function<String,String> resultado = s -> "O valor "+ s;

        //Function<String,String> teste = s -> String.format(s);

        for(int i = 0; i < 25; i++){
            Random rand = new Random();
            int valor = rand.nextInt(150);
            //String valor = parImpar.apply(i);
            String resultadoFinal = parImpar.andThen(resultado).apply(valor);
            System.out.println(resultadoFinal);
            //System.out.println(resultado.apply(valor));
        }
    }
}
