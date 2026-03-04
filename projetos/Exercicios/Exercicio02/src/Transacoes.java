import java.math.BigDecimal;

public class Transacoes {
    private Conta contaDebitada;
    private Conta contaCreditada;

    public void realizarTransferencia(Conta contaDebitada, Conta contaCreditada, BigDecimal valor) {
//        if (contaDebitada.getSaldo().compareTo(valor) >= 0) {
//
//        }
    }

    public Conta getContaDebitada() {
        return contaDebitada;
    }

    public void setContaDebitada(Conta contaDebitada) {
        this.contaDebitada = contaDebitada;
    }

    public Conta getContaCreditada() {
        return contaCreditada;
    }

    public void setContaCreditada(Conta contaCreditada) {
        this.contaCreditada = contaCreditada;
    }
}
