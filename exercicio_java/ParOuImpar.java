/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 2) I - Ler um valor inteiro qualquer e

* Apresentar uma mensagem informando se o valor é Par ou Impar 

*/
public class ParOuImpar
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// (FOR), para percorrer o vetor args;	
		for(int i = 0; i < args.length; i++){
		
			// Conversão da variável para o parâmetro (args);
			int vl = Integer.parseInt( args[0] );
			
			// Condição para saber se o valor é Par ou Impar;
			if(vl %2 == 0){
				System.out.println("O valor digitado é PAR");
			
			// Caso a primeira condição não seja atendida, executa-se essa;
			}else{
				System.out.println("O valor digitado é IMPAR");
			}
		}
	}
}