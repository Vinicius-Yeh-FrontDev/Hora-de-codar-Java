package Lista;
import java.util.Scanner;
public class UmDoisTr�s {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double r;
		
		System.out.println("Informe um n�mero");;
		r = input.nextDouble();
		
		if(r<0) {
			System.out.println("O n�mero informado � negativo");
		}else if(r==0) {
			System.out.println("O n�mero informado � neutro (0)");
		}else {
			System.out.println("O n�mero informado � positivo");
		}
		input.close();
	}
}
