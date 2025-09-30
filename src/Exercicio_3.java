import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        // Criar o scanner para ler as notas
        Scanner scanner = new Scanner(System.in);

        // Pedir as 4 notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Calcular a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibir a média
        System.out.println("A média das notas é: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
