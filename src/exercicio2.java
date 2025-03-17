import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int palpite;
        int valorCorreto = 10000;

        System.out.println("Digite o seu palpite: ");
        palpite = teclado.nextInt();
        
        String msg;

        while(palpite != valorCorreto) {
            msg = palpite < valorCorreto ? "Um pouco mais..." : "Um pouco menos...";
            System.out.println(msg);
            System.out.println("Digite outro palpite: ");
            palpite = teclado.nextInt();
        }
        teclado.close();
        System.out.println("Parabéns, você acertou!");
    }
}
