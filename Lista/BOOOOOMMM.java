package Lista;

public class BOOOOOMMM {
	public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println("Contagem Regressiva: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("EXPLOSÃO!");
    }
}
