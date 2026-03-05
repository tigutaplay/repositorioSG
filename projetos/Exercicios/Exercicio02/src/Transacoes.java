import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Transacoes {
    Conta conta = new Conta();
    private Scanner scanner = new Scanner(System.in);
    private boolean operacaoValida = false;

    public void depositar() {
        System.out.println("Selecionar conta de depósito");
        int idConta = conta.identificarConta();
        if (idConta != 0) {
            System.out.println("Nome do usuário: " + conta.idParaNome.get(idConta) + "\n" + "Agencia: " + conta.idParaAgencia.get(idConta));
            BigDecimal valor = pegarValorTransacao();
            if (valor.compareTo(BigDecimal.ZERO) > 0 ) {
                conta.idParaSaldo.put(idConta, conta.idParaSaldo.get(idConta).add(valor));
                System.out.println("Depósito realizado  com sucesso!");
                System.out.println("Novo saldo: R$" + conta.idParaSaldo.get(idConta));
            }
        }
    }

    public void sacar() {
        System.out.println("Selecionar conta de saque");
        int idConta = conta.identificarConta();
        if (idConta != 0) {
            System.out.println("Nome do usuário: " + conta.idParaNome.get(idConta) + "\n" + "Agencia: " + conta.idParaAgencia.get(idConta));
            BigDecimal valor = pegarValorTransacao();
            if (valor.compareTo(BigDecimal.ZERO) > 0 ) {
                if (conta.idParaSaldo.get(idConta).compareTo(valor) == 1) {
                    conta.idParaSaldo.put(idConta, conta.idParaSaldo.get(idConta).subtract(valor));
                    System.out.println("Saque realizado  com sucesso!");
                    System.out.println("Novo saldo: R$" + conta.idParaSaldo.get(idConta));
                } else {
                    System.out.println("Valor do saque superio ao valor saldo do usuário! Operação inválida");
                    System.out.println("Saldo: R$" + conta.idParaSaldo.get(idConta));
                }
            }
        }
    }

    public void transferir() {
        System.out.println("Selecionar conta remetente");
        int idContaRemetente = conta.identificarConta();
        if (idContaRemetente != 0) {
            System.out.println("Nome do usuário: " + conta.idParaNome.get(idContaRemetente) + "\n" + "Agencia: " + conta.idParaAgencia.get(idContaRemetente));
            BigDecimal valor = pegarValorTransacao();
            if (valor.compareTo(BigDecimal.ZERO) > 0 ) {
                if (conta.idParaSaldo.get(idContaRemetente).compareTo(valor) == 1) {
                    System.out.println("Selecionar conta de destino");
                    int idContaDestino = conta.identificarConta();
                    if (idContaDestino != 0) {
                        System.out.println("Nome do usuário: " + conta.idParaNome.get(idContaDestino) + "\n" + "Agencia: " + conta.idParaAgencia.get(idContaDestino));
                        conta.idParaSaldo.put(idContaRemetente, conta.idParaSaldo.get(idContaRemetente).subtract(valor));
                        conta.idParaSaldo.put(idContaDestino, conta.idParaSaldo.get(idContaDestino).add(valor));
                        System.out.println("Depósito realizado  com sucesso!");
                        System.out.println("Novo saldo da conta " + conta.idParaConta.get(idContaRemetente) + ": " + conta.idParaSaldo.get(idContaRemetente));
                        System.out.println("Novo saldo da conta " + conta.idParaConta.get(idContaDestino) + ": " + conta.idParaSaldo.get(idContaDestino));
                    }
                } else {
                    System.out.println("Valor da transação superio ao valor saldo do usuário " + conta.idParaNome.get(idContaRemetente) + "da conta " + conta.idParaConta.get(idContaRemetente) + "! Operação inválida");
                }
            }
        }
    }

    private BigDecimal pegarValorTransacao() {
        System.out.print("Valor da transação: R$");
        BigDecimal valor = scanner.nextBigDecimal();
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Valor inválido!");
            return BigDecimal.valueOf(0);
        } else {
            return valor;
        }
    }
}
