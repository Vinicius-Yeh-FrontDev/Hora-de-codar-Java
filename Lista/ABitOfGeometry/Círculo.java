package Lista.ABitOfGeometry;
import java.util.Scanner;
public class C�rculo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.14f;
		double r, result;
		
		System.out.println("Qual o raio?");
		r = input.nextDouble();
		
		result = (r*r)*PI;
		
		System.out.println("A �rea do C�rculo �: "+result);

		input.close();
	}
}
