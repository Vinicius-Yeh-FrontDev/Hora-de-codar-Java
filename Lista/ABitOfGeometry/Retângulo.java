package Lista.ABitOfGeometry;
import java.util.Scanner;
public class Ret�ngulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float b, h, result;
		
		System.out.println("Qual o valor da base?");
		b = input.nextFloat();
		
		System.out.println("Qual o valor da altura?");
		h = input.nextFloat();
		
		result = b*h;
		
		System.out.println("A �rea do Ret�ngulo �: "+result);
		input.close();
	}
}
