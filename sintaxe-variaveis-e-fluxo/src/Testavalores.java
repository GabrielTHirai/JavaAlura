
public class Testavalores {
//para não ter que ficar escrevendo o public static void main, se usa (no eclipse) somente o main, e segurando o ctrl + espaço, vai aparecer uma janela, é só apertar o enter
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo);
	}
}
