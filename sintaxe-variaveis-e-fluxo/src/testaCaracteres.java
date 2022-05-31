
public class testaCaracteres {

	public static void main(String[] args) {
		char letra = 'a';//o char guarda apena 1 letra, e se usa as aspas simples, como na linguagem C
		System.out.println(letra);
		
		char valor = 66;//o 66 na tabela do unicode é o B
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia";//a String guarda uma frase, diferente do char que guarda somente uma letra, e tambem se usa as aspas dupla
		System.out.println(palavra);
		
		palavra = palavra + 2020;//nesse caso ele vai concatenar o que estiver no +, diferente do que no char que precisa ser convertido para char para que dai seja feito algo
		System.out.println(palavra);
		//String é algo comum no Java, tem varias funções alem de somente guardar uma frase
		//o String serve tambem para a materia de orientação a objetos
	}
}
