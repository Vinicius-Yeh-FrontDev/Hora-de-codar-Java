package Lista.ABitOfGeometry;
import java.util.Scanner;
public class Trap�zio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float bMaior,bMenor, h, result;
		
		System.out.println("Qual o valor da Base Maior?");
		bMaior = input.nextFloat();
		
		System.out.println("Qual o valor da Base Menor?");
		bMenor= input.nextFloat();
		
		System.out.println("Qual o valor da altura?");
		h = input.nextFloat();
		
		result = ((bMenor+bMaior)*h)/2;
		
		System.out.println("A �rea do Trap�zio �: "+result);
		
		input.close();
	}
}
