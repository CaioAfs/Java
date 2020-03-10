
package application;

import entities.CurrencyConvertor;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        CurrencyConvertor convertor=new CurrencyConvertor();
        Scanner ler=new Scanner(System.in);
        
        System.out.println("Qual o valor do Dolár atualmente?");
        double preco=ler.nextDouble();
        System.out.println("Quantos Dólar você está comprando?");
        double quantidade=ler.nextDouble();
        double resultado=CurrencyConvertor.dollarTotal(preco, quantidade);
        System.out.println(resultado);
    }
    
}
