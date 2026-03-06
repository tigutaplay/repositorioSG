import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {
    public static List<ContaBancaria> contasBancarias = new ArrayList<>();

    public static void adicionarConta() {
        ContaBancaria contaBancaria = Scanners.pegarDadosConta();
        if (pegarContaExistente(contaBancaria.getAgencia(), contaBancaria.getNumero()) != null) return;
        contasBancarias.add(contaBancaria);
        System.out.println("Conta criada com sucesso");
    }

    public static ContaBancaria pegarContaExistente(String agencia, String numeroConta) {
        return contasBancarias.stream()
                .filter(contaBancaria -> Objects.equals(contaBancaria.getAgencia(), agencia) && Objects.equals(contaBancaria.getNumero(), numeroConta))
                .findFirst().orElse(null);
    }

    public static void removerConta() {
        ContaBancaria contaBancaria = Scanners.pegarContaPorAgenciaNumero();
        if (contaBancaria == null) return;
        if (contaBancaria.getSaldo().compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("É necessario saldo ser igual a zero");
            return;
        }
        contasBancarias.remove(contaBancaria);
        System.out.println("Conta removida com sucesso");
    }
}
