
public class testeconversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		float pontoFlutuante = 3.14f;
		int valor = (int)salario;//casting, ou seja, transforma o double em inteiro, tem em c tambem
		System.out.println(valor);
		
		long numeroGrande = 21231231123212L;
		System.out.println(numeroGrande);
		short valorPequeno = 2131; 
		byte b = 127;
	}
}
