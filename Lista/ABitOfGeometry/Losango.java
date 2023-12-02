package Lista.ABitOfGeometry;
import java.util.Scanner;
public class Losango {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float dMaior, dMenor, result;
		
		System.out.println("Qual o valor da diagonal menor?");
		dMenor = input.nextFloat();
		
		System.out.println("Qual o valor da diagonal maior?");
		dMaior = input.nextFloat();
		
		result = (dMenor*dMaior)/2;
		
		System.out.println("A área do Losango é: "+result);
	
		input.close();
	}
}
