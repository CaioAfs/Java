import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("Maria"));
        lista.add(0,new Usuario("Fernando"));

        System.out.println(lista.size());

        for(Usuario u: lista){
            System.out.println(u.toString());
        }

        System.out.println(lista.contains(new Usuario("Carl")));
        System.out.println(lista.contains(new Usuario("Carlos")));
        System.out.println(lista.remove(1));

    }
}