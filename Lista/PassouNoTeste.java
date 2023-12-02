package Lista;
import java.util.Scanner;
public class PassouNoTeste {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alunosAprovados = 0;

        do {
            double somaNotas = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Informe a nota " + i + ": ");
                double nota = input.nextDouble();
                somaNotas += nota;
            }

            double mediaFinal = somaNotas / 6;

            if (mediaFinal >= 6.5) {
                System.out.println("Média Final: " + mediaFinal);
                System.out.println("Aluno Aprovado!");
                alunosAprovados++;
            } else {
                System.out.println("Média Final: " + mediaFinal);
                System.out.println("Aluno Reprovado.");
            }

            System.out.print("Calcular a média de outro aluno? (S/N): ");
            char resposta = input.next().charAt(0);

            if (resposta != 'S' && resposta != 's') {
                break;
            }

        } while (true);

        System.out.println("Total de alunos aprovados: " + alunosAprovados);

        input.close();
    }
}
