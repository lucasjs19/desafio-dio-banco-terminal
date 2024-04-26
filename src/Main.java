import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        Integer numero = sc.nextInt();
        System.out.println("Por favor, digite a agência da conta: ");
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome do titular da conta: ");
        sc.next();
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        Double saldo = sc.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.println(conta);
    }
}