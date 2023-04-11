import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> catalogo = new HashMap<>();

        catalogo.put(15,"Bolo de chocolate");
        catalogo.put(3,"Coxinha de frango");
        catalogo.put(5, "Refrigerante");

        System.out.println(catalogo.size());
        System.out.println(catalogo.keySet());
        System.out.println(catalogo.entrySet());
        System.out.println(catalogo.containsKey(25));

        System.out.println("--Chave--");

        for(int chave : catalogo.keySet()){
            System.out.println(chave);
        }

        System.out.println("--Valor--");

        for(String nomes : catalogo.values()){
            System.out.println(nomes);
        }

        System.out.println("--Chave & valor--");

        for(Map.Entry<Integer,String> registro : catalogo.entrySet()){
            System.out.println(registro);
        }

        System.out.println("Será removido: "+ catalogo.remove(5));
    }
}