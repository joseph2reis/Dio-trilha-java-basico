import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Que bom ter você aqui, digite seu nome para realizar o cadastro em nosso banco");
        String nome_cliente = scanner.next();
        
        System.out.println("Digite agora seu CPF");
        String cpf = scanner.next();

        String agencia = "245-5";
        int conta = 1213;
        double saldo = 237.48;

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", Conta: " + conta + " e seu saldo ja está disponivel para saque " + "R$" + saldo);
    }

}
