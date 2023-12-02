package Lista;
import java.util.Scanner;
public class Parab�ns {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int TAM = 4;
        final double MEDIA_MINIMA_APROVACAO = 6.0;
        double[] notas = new double[TAM];
        double media, soma = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe a nota da avalia��o " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        media = soma / TAM;


        System.out.println("M�dia do semestre: " + media);

        if (media >= MEDIA_MINIMA_APROVACAO && TAM == 4) {
            System.out.println("PARAB�NS! Voc� foi aprovado!");
        } else {
            System.out.println("Infelizmente, voc� n�o foi aprovado.");
        }

        input.close();
    }
}
