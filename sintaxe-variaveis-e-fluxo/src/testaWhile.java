
public class testaWhile {

	public static void main(String[] args) {
		int contador=0;//precisa atribuir o numero inicial no java, senão não compila
		while(contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;//contagem
			//contador += 1//isso significa que a variavel vai ser igual a ela mesma + 1, isso é herança de algumas outras linguagens(C++)
			//contador++ tambem faz o contador + 1
		}
	}
}
