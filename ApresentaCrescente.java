/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es):Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercío 2) D - Receber três valores inteiros e apresenta-los

* Em ordem crescente.

*/
public class ApresentaCrescente
{
	// Método de acesso;
	public static void main(String[] args){
		
		// Tratamento de exceção local;
		try{
			int rcb = 0;
			
			// Vetor que recebe como atributos, a conversão dos valores
			// Passados depois de (args);
			int VALOR[] = {Integer.parseInt( args[0] ), Integer.parseInt( args[1] ),
				Integer.parseInt( args[2] )};
			
			// (FOR), para percorrer e printar o vetor em ordem decrescente;

			for(int i = 0; i < VALOR.length; i++){
				System.out.println("Os números digitados:" +VALOR[i]);
			}
			System.out.print("\n");
			
			// (FOR), para percorrer e printar o vetor em ordem crescente;

			for(int i = 2; i < VALOR.length; i--){
				System.out.println("Os números em ordem são:" +VALOR[i]);
			}
						

		}catch(Exception e){

		}	
	}
}