import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner terminal = new Scanner(System.in);

        //Declaração das variaveis
        String agencia;
        int numeroConta;
        String nomeCliente;
        double saldo;

        // Solicita e obtem o número da Agência
        System.out.println("Insira o número da Agência: ");
        agencia = terminal.nextLine();

        // Solicita e obtem o número da Conta
        System.out.println("Insira o número da Conta: ");
        numeroConta = terminal.nextInt();
        terminal.nextLine();

        // Solicita e obtem o nome do cliente 
        System.out.println("Insira o nome do cliente: ");
        nomeCliente = terminal.nextLine();

        // Solicita e obtem o valor do saldo do cliente 
        System.out.println("Insira o valor de saldo: ");
        saldo = terminal.nextDouble();
        terminal.nextLine();

        //Formata o valor do saldo para duas casas decimais
        String saldoFormatado = String.format("%.2f", saldo);

        //Apresenta a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldoFormatado + " já está disponível para saque.");

        //Fecha o Scanner
        terminal.close();
    }
}
