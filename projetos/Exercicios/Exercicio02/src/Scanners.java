import java.math.BigDecimal;
import java.util.Scanner;

public class Scanners {
    public static ContaBancaria pegarDadosConta() {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();
        System.out.println("Número da agencia: ");
        contaBancaria.setAgencia(scanner.nextLine());
        System.out.println("Número da conta: ");
        contaBancaria.setNumero(scanner.nextLine());
        System.out.println("Nome  do titular: ");
        contaBancaria.setTitular(scanner.nextLine());
        System.out.println("Saldo da conta: ");
        contaBancaria.setSaldo(scanner.nextBigDecimal());
        contaBancaria.setStatus(true);
        return contaBancaria;
    }

    public static ContaBancaria pegarContaPorAgenciaNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número da agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Número da conta: ");
        String numero = scanner.nextLine();
        if (Banco.pegarContaExistente(agencia, numero) == null) {
            System.out.println("Conta não encontrada");
        }
        return Banco.pegarContaExistente(agencia, numero);
    }

    public static BigDecimal pegarValorTransacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor da transação: R$");
        BigDecimal valor = scanner.nextBigDecimal();
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Valor inválido!");
            return BigDecimal.valueOf(0);
        } else {
            return valor;
        }
    }

    public static boolean confirmacaoScanner() {
        System.out.print("[1]Sim [0]Não: ");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        if (valor == 1) {
            return true;
        } else if (valor == 0){
            return false;
        } else {
            confirmacaoScanner();
            return false;
        }
    }

    public static int intScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
