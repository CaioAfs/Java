
package entities;

public class CurrencyConvertor {

   public static double IOF=0.06;
   
   public static double dollarTotal(double preco,double quantidade){
       return quantidade*preco*(1.0+IOF);
   }
}
