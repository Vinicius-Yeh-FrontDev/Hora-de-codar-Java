package Lista;
import java.util.Scanner;
public class QualOMaior_Pior {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TAM=4;
		int valores[], i, maior=-9999;
		valores = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Informe um valor");
			valores[i]=input.nextInt();
		}
		for(i=0;i<TAM;i++) {
			if(valores[i]>maior) {
				maior = valores[i];
			}
		}
		
		System.out.println("O maior valor informado é: "+maior);
		
		input.close();
	}
}
