
package application;

import entities.Funcionario;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Funcionario func=new Funcionario();
        
        System.out.println("Digite seu nome,seu salário e a taxa cobrada do salário abaixo:");
        func.nome=ler.next();
        func.salarioBruto=ler.nextDouble();
        func.taxa=ler.nextDouble();
        
        System.out.println(func);

        System.out.println("Deseja aumentar o salario em quantos %?");
        double porcentagem=ler.nextDouble();
        func.aumentarSalario(porcentagem);
        
        System.out.println(func);
    }
    
}
