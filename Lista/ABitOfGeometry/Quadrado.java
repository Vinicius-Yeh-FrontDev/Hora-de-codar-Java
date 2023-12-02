package Lista.ABitOfGeometry;
import java.util.Scanner;
public class Quadrado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float lado, result;
		
		System.out.println("Qual o valor de um dos lados?");
		lado = input.nextFloat();
		
		result = lado*lado;
		
		System.out.println("A área do Quadrado é: "+result);
		
		input.close();
	}
}
