package Lista;
import java.util.Scanner;
import java.util.Arrays;
public class QualOQue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int TAM = 3;
		int valores[] = new int[TAM];
        int i, soma;
		
		for (i=0;i<TAM;i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = input.nextInt();
        }

        Arrays.sort(valores);
        soma= valores[TAM - 1] + valores[TAM- 2];

        System.out.println("A soma dos dois maiores valores é: " + soma);

        input.close();
	}
}
