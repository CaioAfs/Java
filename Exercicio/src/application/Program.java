
package application;

import entities.Product;
import java.util.Scanner;


public class Program {


    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Product product=new Product();
        
        System.out.println("Digite o produto:");
        System.out.println("Name:");
        product.name=ler.next();
        System.out.println("Price:");
        product.price=ler.nextDouble();
        System.out.println("Quantity in stock:");
        product.quantity=ler.nextInt();        
        System.out.println();
        System.out.println("Product Data \n" + product);
        
        System.out.println("Adicionar produto no estoque:");
        int quantity=ler.nextInt();
        product.addProducts(quantity);
        
        System.out.println("Remover produto do estoque:");
        quantity=ler.nextInt();
        product.removeProducts(quantity);
        
        System.out.println(product);
        
    }
    
}
