import java.util.Scanner;

public class ProgramaNome {
	public static void main(String args[]){
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Ol�, digite o seu nome");
		nome = leitor.next();
		
		//ler textos com espa�o:
		//nome = leitor.nextLine();
		
		System.out.println("Que legal que seu nome �: " +nome);
		
		//ap�s utilizar o leitor, fechar para liberar seu uso pra outra fun��o
		
		leitor.close();
		
		
	}

}
