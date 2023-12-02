package Lista;
import java.util.Scanner;
public class aBitOfInformation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		int idd;
		
		System.out.println("Qual o seu nome?");
		nome = input.next();
		
		System.out.println("Qual a sua idade?");
		idd = input.nextInt();
		
		System.out.println("Olá, "+nome+", sua idade é "+idd+".");
	}
	
}
