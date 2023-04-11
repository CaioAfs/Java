import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("LU","GUI","JU","PI","Joao","Ana","Pedro","\n");
        //List
        for( String nome : aprovados){
            System.out.println(nome);
        }

        //INTERATOR
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //System.out.println(it.hasNext());
        }
        //STREAM
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);



    }
}