package Lista.ABitOfGeometry;
import java.util.Scanner;
public class Tri�ngulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float b, h, result;
		
		System.out.println("Qual a altura?");
		h = input.nextFloat();
		
		System.out.println("Qual o valor da base?");
		b = input.nextFloat();
		
		result = (b*h)/2;
		
		System.out.println("A �rea do Tri�ngulo �: "+result);
		
		input.close();
	}
}
