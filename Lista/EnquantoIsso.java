package Lista;
import java.util.Scanner;
public class EnquantoIsso {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double primeiroValor, segundoValor;
        System.out.print("Informe o primeiro valor: ");
        primeiroValor = input.nextDouble();

        do {
            System.out.print("Informe o segundo valor (n�o pode ser zero ou negativo): ");
            segundoValor = input.nextDouble();
        } while (segundoValor <= 0);

        if (segundoValor != 0) {
            double resultadoDivisao = primeiroValor / segundoValor;
            System.out.println("O resultado da divis�o �: " + resultadoDivisao);
        } else {
            System.out.println("N�o � poss�vel dividir por zero.");
        }

        input.close();
    }
}
