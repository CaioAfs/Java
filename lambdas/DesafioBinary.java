import java.text.DecimalFormat;
import java.util.function.*;

public class DesafioBinary {
    public static void main(String[] args) {

        DecimalFormat deci = new DecimalFormat("0.00");

        Produto p = new Produto("iPad",3235.89,0.13);

        BinaryOperator<Double> precoReal = (n1, n2) -> n1 * (1-n2);
        UnaryOperator<Double> imposto = n1 -> n1 >= 2500 ? n1 + (n1*8.5/100): n1;
        UnaryOperator<Double> frete = n1 -> n1 >= 3000 ? n1 + 100: n1 + 50;

        // Meu
        //UnaryOperator<Double> arredondar = n1 -> Math.ceil(n1);
        //Function<Double,String> botarCasas = n1 -> deci.format(n1);
        //Arrendondando preco ?????? ashuahs

        // curso
        //UnaryOperator<Double> arrendodarCurso = n1 -> Double.parseDouble(String.format("%.2f",n1));
        // fim curso

        //Minha segunda opcao
        Function<Double,String> arrendodarMelhorado = n1 -> "R$" + deci.format(n1);


        //Function<String,String> finalizacao = n1 -> "R$" + n1;


        System.out.println(precoReal.andThen(imposto).andThen(frete).andThen(arrendodarMelhorado).apply(p.valor,p.desconto));

    }
}
