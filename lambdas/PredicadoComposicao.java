import java.util.Random;
import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num > 100 && num <= 999;

        Random rand = new Random();

        for (int i = 0; i < 10 ; i++){
            int valor = rand.nextInt(1500);

            //System.out.println(valor +" "+ isPar.and(isTresDigitos).test(valor));
            //System.out.println(valor +" "+ isPar.or(isTresDigitos).test(valor));
        }
    }
}
