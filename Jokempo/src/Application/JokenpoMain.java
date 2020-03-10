
package Application;

import Resources.Batalha;
import java.util.Random;
import java.util.Scanner;

public class JokenpoMain {

    public static void main(String[] args) {
        
       Random rand = new Random();
       Batalha x=new Batalha();
       Scanner ler=new Scanner(System.in);
       Scanner sc=new Scanner(System.in);
     
        for(String i="s";"s".equals(i);){
            System.out.println("0-pedra \n1-papel\n2-tesoura");
       
            //robô
            int limite = 3;
            x.valorRandom = rand.nextInt(limite); //random do robô

            //humano   
            x.escolha=ler.nextInt();   //escolha do humano
            
            x.resultado();
            
            System.out.println("deseja repetir? (s ou n)");
            i=sc.next();            
        }    
    }
}
    

