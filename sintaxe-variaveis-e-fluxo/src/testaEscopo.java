
public class testaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		// sysout e o ctrl + espaço ja escreve sozinho

		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado; // boolean só aceita o true ou false, nada mais
		// o que pode ser feito no boolean tambem é a verificação do true or false--
		// --dentro da variavel booleana. por exemplo "boolean acompanhado = acompanhado >= 2"
		// int não entra em boolean
		// o "&&" significa o "e", ou o "and"
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		System.out.println("o valor é " + acompanhado);
		if (idade >= 18 && acompanhado == true) {// o "||" no java significa o "or" ou o "ou"
			// "==" no java é para verificação de equivalencia
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
