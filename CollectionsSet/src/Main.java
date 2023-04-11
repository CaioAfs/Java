import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Heterogêneo
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add("teste");
        conjunto.add(true);
        conjunto.add(10);
        conjunto.add(3);

        System.out.println(conjunto.size());

        conjunto.remove("Teste"); //Errado
        conjunto.remove("teste");

        System.out.println(conjunto);

        //Homogêneo
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        nums.retainAll(conjunto);
        System.out.println(nums); // apenas 3 é comum

        //Teste não ordenado
        Set<String> nomes = new HashSet<>();

        nomes.add("Pedro");
        nomes.add("Diego");
        nomes.add("Ana");
        nomes.add("Fernando");
        nomes.add("Vitoria");
        nomes.add("Maria");

        for(String candidatos: nomes){
            System.out.println(candidatos);
        }

        //Teste ordenado
        SortedSet<Double> numeros = new TreeSet<>();

        numeros.add(1.1);
        numeros.add(1.3);
        numeros.add(1.6);

        for(Double valores: numeros){
            System.out.println(valores);
        }


    }
}