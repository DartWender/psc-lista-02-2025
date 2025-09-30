import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        // Criar o scanner para ler o número
        Scanner scanner = new Scanner(System.in);

        // Pedir o número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Exibir a mensagem
        System.out.println("O número informado foi " + numero);

        // Fechar o scanner
        scanner.close();
    }
}
