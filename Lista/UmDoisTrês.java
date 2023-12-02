package Lista;
import java.util.Scanner;
public class UmDoisTrês {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double r;
		
		System.out.println("Informe um número");;
		r = input.nextDouble();
		
		if(r<0) {
			System.out.println("O número informado é negativo");
		}else if(r==0) {
			System.out.println("O número informado é neutro (0)");
		}else {
			System.out.println("O número informado é positivo");
		}
		input.close();
	}
}
