package Lista;
import java.util.Scanner;
public class CansarDeDigitar {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int TAM = 10;
        int[] valores = new int[TAM];
        int soma = 0;
        double media;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe o " + (i + 1) + "� valor: ");
            valores[i] = input.nextInt();
            soma += valores[i];
        }

        System.out.print("N�meros informados: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println(); 

        media = (double) soma / TAM;
        System.out.println("M�dia aritm�tica: " + media);

        input.close();
    }
}
