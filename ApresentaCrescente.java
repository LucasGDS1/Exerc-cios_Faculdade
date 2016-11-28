/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es):Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�o 2) D - Receber tr�s valores inteiros e apresenta-los

* Em ordem crescente.

*/
public class ApresentaCrescente
{
	// M�todo de acesso;
	public static void main(String[] args){
		
		// Tratamento de exce��o local;
		try{
			int rcb = 0;
			
			// Vetor que recebe como atributos, a convers�o dos valores
			// Passados depois de (args);
			int VALOR[] = {Integer.parseInt( args[0] ), Integer.parseInt( args[1] ),
				Integer.parseInt( args[2] )};
			
			// (FOR), para percorrer e printar o vetor em ordem decrescente;

			for(int i = 0; i < VALOR.length; i++){
				System.out.println("Os n�meros digitados:" +VALOR[i]);
			}
			System.out.print("\n");
			
			// (FOR), para percorrer e printar o vetor em ordem crescente;

			for(int i = 2; i < VALOR.length; i--){
				System.out.println("Os n�meros em ordem s�o:" +VALOR[i]);
			}
						

		}catch(Exception e){

		}	
	}
}