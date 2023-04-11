import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("ana"); // Retorna False
        fila.offer("João"); // Retorna uma exceção
        fila.add("Fernando");
        fila.offer("Pedro");
        fila.add("Beatriz");
        fila.offer("Gustavo");

        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.element()); // Retorna uma exceção

        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        System.out.println(fila.stream().findFirst().hashCode());

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Odisseia, Homero");
        livros.add("Frankenstein, Mary Shelley");
        livros.add("Dom Quixote, Miguel de Cervantes");
        livros.add("1984, George Orwell");

        System.out.println(livros.peek());


    }
}