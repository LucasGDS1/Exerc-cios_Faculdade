/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 2) C - Ler quatro valores referentes a 

* Notas escolares de um aluno(a) e apresentar uma mensagem

* Informando se o aluno foi aprovado ou reprovado

*/
public class MediaAluno
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		double media = 0;
		
		// (FOR), para receber as quatro notas;
		for(int i = 0; i < 4; i++){
			
			// Convers�o das vari�veis para o par�metro (args);
			float nota_1 = Float.parseFloat( args[0] );
			float nota_2 = Float.parseFloat( args[1] );
			float nota_3 = Float.parseFloat( args[2] );
			float nota_4 = Float.parseFloat( args[3] );
			
			// Formula para calcular a m�dia do aluno;
			media = (nota_1+nota_2+nota_3+nota_4)/4;	
		}
			// Condi��o para saber se m�dia � maior ou igual a 6.0;
			if(media >= 6.0){
				
				// Informativo sobre a situa��o do aluno;
				System.out.println("O aluno foi APROVADO!!!");
				System.out.println("A m�dia do aluno �: "+media);

			// Caso n�o seja atendida a primeira condi��o, executa-se essa;
			}else{
				// Informativo sobre a situa��o do aluno;
				System.out.println("O aluno infelizmente n�o passou!!!");
				System.out.println("A m�dia do aluno �: "+media);
			}
	}
}