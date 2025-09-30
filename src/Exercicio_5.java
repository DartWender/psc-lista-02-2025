import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        // Criar o scanner para ler os dados
        Scanner scanner = new Scanner(System.in);

        // Pedir os preços das viagens e a quantidade de pessoas
        System.out.print("Digite o preço da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();

        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();

        System.out.print("Digite o preço da viagem para a Itália: ");
        double precoItalia = scanner.nextDouble();

        System.out.print("Digite a quantidade de pessoas que irão para a Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.print("Digite a quantidade de pessoas que irão para Portugal: ");
        int pessoasPortugal = scanner.nextInt();

        System.out.print("Digite a quantidade de pessoas que irão para a Itália: ");
        int pessoasItalia = scanner.nextInt();

        // Calcular o valor total de cada viagem
        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        // Calcular o valor total de todas as viagens
        double valorTotalViagens = totalAlemanha + totalPortugal + totalItalia;

        // Exibir o valor total das viagens
        System.out.println("O valor total das viagens é: R$ " + valorTotalViagens);

        // Fechar o scanner
        scanner.close();
    }
}
