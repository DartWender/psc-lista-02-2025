import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        // Criar o scanner para ler os dados
        Scanner scanner = new Scanner(System.in);

        // Pedir o preço do litro e os litros vendidos
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        // Calcular o valor a ser pago
        double valorTotal = precoLitro * litrosVendidos;

        // Exibir o valor total
        System.out.println("O cliente deverá pagar: R$ " + valorTotal);

        // Fechar o scanner
        scanner.close();
    }
}
