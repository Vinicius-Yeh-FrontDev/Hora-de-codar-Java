package Lista;
import java.util.Scanner;
public class HelloClarisse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nomeDoUsuario;
		
		System.out.println("Qual o seu nome?");
		nomeDoUsuario = input.next();
		
		System.out.println("Olá, "+nomeDoUsuario+"! Bem-vindo.");
		
		input.close();
	}

}
