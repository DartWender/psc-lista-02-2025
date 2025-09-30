import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        // Criar o scanner para ler os números
        Scanner scanner = new Scanner(System.in);

        // Pedir os dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar as operações
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;

        // Imprimir os resultados
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + subtracao);
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);

        // Fechar o scanner
        scanner.close();
    }
}
