
package application;

import entities.Rectangle;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Rectangle rectangle=new Rectangle();
        
        System.out.println("Digite a largura do triangulo:");
        rectangle.largura=ler.nextDouble();
        
         System.out.println("Digite a altura do triangulo:");
         rectangle.altura=ler.nextDouble();
         
         System.out.println(rectangle);     
    }  
}
