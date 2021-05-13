import java.util.Scanner;

public class ProgramaNome {
	public static void main(String args[]){
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Olá, digite o seu nome");
		nome = leitor.next();
		
		//ler textos com espaço:
		//nome = leitor.nextLine();
		
		System.out.println("Que legal que seu nome é: " +nome);
		
		//após utilizar o leitor, fechar para liberar seu uso pra outra função
		
		leitor.close();
		
		
	}

}
