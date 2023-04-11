package aprendizado;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		float primeira=(float) Math.pow(6*(3+2) , 2);
		float segunda=3*2;
		
		float terceira=(1-5)*(2-7);
		float quarta=2;
		
		float quinta=primeira/segunda;
		float sexta=(float) Math.pow(terceira/quarta, 2);
		
		float setima=(float) Math.pow(quinta-sexta,3);
		float oitava= (float) Math.pow(10, 3);
		
		float nona=setima/oitava;
		
		System.out.println(nona);
		

	} 

}
