import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = input.nextInt();

        System.out.println("Por favor, digite o número da agência :");
        String agencia = input.next();

        System.out.println("Por favor, digite o seu primeiro nome: ");
        String nomeCliente = input.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
