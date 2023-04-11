package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu","Gui","Ana");

//        for( String nome : aprovados){
//            System.out.println(nome);
//        }

        //Iterator
//        Iterator<String> iterator = aprovados.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);



    }
}
