import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Saque implements Caixa {
    Scanner scanner = new Scanner(System.in);
    int[] qCedulas = {5,5,5,5,5,5,5,5,5,5,5,5,2};

    private BigDecimal[] cedlas = {BigDecimal.valueOf(200.00),
            BigDecimal.valueOf(100.00),
            BigDecimal.valueOf(50.00),
            BigDecimal.valueOf(20.00),
            BigDecimal.valueOf(10.00),
            BigDecimal.valueOf(5.00),
            BigDecimal.valueOf(2.00),
            BigDecimal.valueOf(1.00),
            BigDecimal.valueOf(0.50),
            BigDecimal.valueOf(0.25),
            BigDecimal.valueOf(0.10),
            BigDecimal.valueOf(0.05),
            BigDecimal.valueOf(0.01),
    };

    @Override
    public void sacar() {
        BigDecimal valorSaque = this.pegarValorSaque();
        System.out.println("Valor do saque : " + valorSaque);
        BigDecimal valorRestante = valorSaque;
        List<Integer> quantidadeCedulasSaque = calculaCedulasSaque(valorRestante);
        apresentarCedulasSaque(quantidadeCedulasSaque);
    }

    private void apresentarCedulasSaque(List<Integer> quantidadeCedulasSaque) {
        for (int i = 0; i < quantidadeCedulasSaque.size(); i++) {
            if (quantidadeCedulasSaque.get(i) == 0) continue;
            System.out.println(quantidadeCedulasSaque.get(i) + " cedulas/moeda de " + cedlas[i]);
        }
    }

    private List<Integer> calculaCedulasSaque(BigDecimal valorRestante ) {
        List<Integer> quantidadeCedulasSaque = new ArrayList<>();
        for (int i = 0; i < cedlas.length; i++) {
            if (valorRestante.compareTo(BigDecimal.ZERO) <= 0) break;

            Integer quantidadeCedulas = valorRestante.divide(cedlas[i]).intValue();
            if (quantidadeCedulas > qCedulas[i]) quantidadeCedulas = qCedulas[i];

            qCedulas[i] -= quantidadeCedulas;
            quantidadeCedulasSaque.add(quantidadeCedulas);
            valorRestante = valorRestante.subtract(cedlas[i].multiply(BigDecimal.valueOf(quantidadeCedulas)));
        }
        if (valorRestante.compareTo(BigDecimal.ZERO) == 0) {
            return quantidadeCedulasSaque;
        }
        System.out.println("Cedulas insuficientes para realizar o saque!");
        return new ArrayList<>();
    }

    private BigDecimal pegarValorSaque() {
        System.out.println("Inserir valor a ser sacado: ");
        return scanner.nextBigDecimal();
    }
}