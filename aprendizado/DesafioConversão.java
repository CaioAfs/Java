package aprendizado;

import java.util.Scanner;
import java.util.Locale;
public class DesafioConversão {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		System.out.println("Digite seus 3 ultimos salários:");
		String valor1=sc.nextLine().replace(",",".");
		String valor2=sc.nextLine().replace(",",".");
		String valor3=sc.nextLine().replace(",",".");
	
		double valor1convertido= Double.parseDouble(valor1);
		double valor2convertido= Double.parseDouble(valor2);
		double valor3convertido= Double.parseDouble(valor3);
		
		double media=(valor1convertido+valor2convertido+valor3convertido)/3;
		System.out.println(media);
		
		sc.close();
	}

}
