
package entities;

public class Rectangle {
    public double altura;
    public double largura;
 
    public double area(){
        return altura*largura;
    }
    
    public double perimetro(){
        return (altura+largura)*2;
    }
    
    public double diagonal(){
        return ((altura*altura + largura*largura) /2);
    }
    
    public String toString(){
        return "Arena:"+area()+"\n"
        + "perimetro:"+perimetro()+"\n"
        + "diagonal:"+diagonal()+"\n";
    }   
}
