/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 2) I - Ler um valor inteiro qualquer e

* Apresentar uma mensagem informando se o valor � Par ou Impar 

*/
public class ParOuImpar
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// (FOR), para percorrer o vetor args;	
		for(int i = 0; i < args.length; i++){
		
			// Convers�o da vari�vel para o par�metro (args);
			int vl = Integer.parseInt( args[0] );
			
			// Condi��o para saber se o valor � Par ou Impar;
			if(vl %2 == 0){
				System.out.println("O valor digitado � PAR");
			
			// Caso a primeira condi��o n�o seja atendida, executa-se essa;
			}else{
				System.out.println("O valor digitado � IMPAR");
			}
		}
	}
}