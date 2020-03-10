
package Resources;

public class Batalha {
    
    public float escolha;
    public int valorRandom;
    
    public void resultado(){
       if(escolha < 0 || escolha >2){
                System.out.println("Invalido");
            }else{

                //empate
               if(valorRandom == 0 && escolha == 0){
                   System.out.println("Robo: Pedra x humano: Pedra \nEmpate");
               }else if(valorRandom == 1 && escolha == 1){
                   System.out.println("Robo: Papel x humano: Papel \nEmpate");
               }else if(valorRandom == 2 && escolha == 2){
                   System.out.println("Robo: Tesoura x humano: Tesoura \nEmpate");
               }
               

               //Robo win
               if(valorRandom == 0 && escolha == 2){
                   System.out.println("Robo: Pedra x humano: tesoura \nRobo Win");
               }else if(valorRandom == 1 && escolha == 0){
                   System.out.println("Robo: papel x humano: pedra \nRobo Win");
               }else if(valorRandom == 2 && escolha == 1){
                   System.out.println("Robo: tesoura x humano: papel \nRobo Win");
               }
               

               //humano win
                if(valorRandom == 2 && escolha == 0){
                   System.out.println("Robo: tesoura x humano: pedra \nHumano win");
               }else if(valorRandom == 0 && escolha == 1){
                   System.out.println("Robo: pedra x humano: papel \nHumano win");
               }else if(valorRandom == 1 && escolha == 2){
                   System.out.println("Robo: papel x humano: tesoura \nHumano win");
               }
    }
    
  }
}
