import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        System.out.println("Digite o seu peso e altura: ");
        Scanner teclado = new Scanner(System.in);
        int peso = teclado.nextInt();
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f", imc);

        teclado.close();
    }
    
}
