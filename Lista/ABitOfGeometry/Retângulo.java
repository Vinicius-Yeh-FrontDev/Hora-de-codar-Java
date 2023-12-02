package Lista.ABitOfGeometry;
import java.util.Scanner;
public class Retângulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float b, h, result;
		
		System.out.println("Qual o valor da base?");
		b = input.nextFloat();
		
		System.out.println("Qual o valor da altura?");
		h = input.nextFloat();
		
		result = b*h;
		
		System.out.println("A área do Retângulo é: "+result);
		input.close();
	}
}
