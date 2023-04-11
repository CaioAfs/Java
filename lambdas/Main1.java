import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Calculo calc = (x, y) ->  x + y;

        System.out.println(calc.executar(2,3));

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

//        Produto p1 = new Produto("Caneta", 25.00);
//        Produto p2 = new Produto("lapis", 10);
//        Produto p3 = new Produto("borracha", 5);
//        Produto p4 = new Produto("estojo", 50);
//        Produto p5 = new Produto("tesoura", 5);
//
//        //imprimir.accept(p1);
//
//        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
//        //produtos.forEach(p -> System.out.println("Nome: " + p.nome + " Valor: " +p.valor));
//
//        produtos.forEach(System.out::println);


    }
}