import java.math.BigDecimal;

public class Transacoes {

    public void sacar() {
        ContaBancaria contaBancaria = Scanners.pegarContaPorAgenciaNumero();
        if (contaBancaria == null) {
            return;
        }
        BigDecimal valor = Scanners.pegarValorTransacao();
        if (!contaBancaria.temSaldoSuficiente(valor)){
            System.out.println("Saldo insuficiente para realzar a transação");
            return;
        }
        executarSaque(contaBancaria, valor);
        System.out.println("Saque realizado com scesso" + "\n" + "Novo saldo: " + contaBancaria.getSaldo());
    }

    public void depositar() {
        ContaBancaria contaBancaria = Scanners.pegarContaPorAgenciaNumero();
        if (contaBancaria == null) {
            return;
        }
        BigDecimal valor = Scanners.pegarValorTransacao();
        executarDeposito(contaBancaria, valor);
        System.out.println("Deposito realizado com scesso" + "\n" + "Novo saldo: " + contaBancaria.getSaldo());
    }

    public void transferir() {
        System.out.println("ORIGEM:");
        ContaBancaria origem = Scanners.pegarContaPorAgenciaNumero();
        if (origem == null) {
            return;
        }
        System.out.println("DESTINO:");
        ContaBancaria destino = Scanners.pegarContaPorAgenciaNumero();
        if (destino == null) {
            return;
        }
        BigDecimal valor = Scanners.pegarValorTransacao();
        if (!origem.temSaldoSuficiente(valor)) {
            System.out.println("Saldo insuficiente na conta de origem para realizar a transação");
            return;
        }
        executarSaque(origem, valor);
        executarDeposito(destino, valor);
        System.out.println("Saque realizado com scesso" + "\n" + "Novo saldo da conta de origem: " + origem.getSaldo());
        System.out.println("Saque realizado com scesso" + "\n" + "Novo saldo da conta de destino: " + destino.getSaldo());
    }

    private void executarSaque(ContaBancaria contaBancaria, BigDecimal valor) {
        contaBancaria.setSaldo(contaBancaria.getSaldo().subtract(valor));
    }

    private void executarDeposito(ContaBancaria contaBancaria, BigDecimal valor) {
        contaBancaria.setSaldo(contaBancaria.getSaldo().add(valor));
    }
}
