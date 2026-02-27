import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.*;

public class Saque implements Caixa {
    Scanner scanner = new Scanner(System.in);
    private float valor;
    private float valorFixo;
    int[] cedulas = new int[13];
/*    private BigDecimal[] cedlas = {BigDecimal.valueOf(200.00),
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
    };*/

    private float[] cedlas = {200.00f,
            100.00f,
            50.00f,
            20.00f,
            10.00f,
            5.00f,
            2.00f,
            1.00f,
            0.50f,
            0.25f,
            0.10f,
            0.05f,
            0.01f,
    };


    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }


    @Override
    public void insereirValor() {
        System.out.println("Inserir valor a ser sacado: ");
        this.setValor(scanner.nextFloat());
        this.setValorFixo(this.getValor());
        System.out.println("Valor do saque : " + this.getValorFixo());
        for (int i = 0; i < cedlas.length; i++) {
            do {
                if (this.valor >= cedlas[i]) {
                    this.setValor(this.getValor() - cedlas[i]);
                    this.cedulas[i]++;
                }
            } while (this.valor >= cedlas[i]);
            if (this.cedulas[i] > 0) {
                System.out.println("Cedulas de " + cedlas[i] + ": " + cedulas[i]);
            }
        }

//        for (BigDecimal cedula: cedlas) {
//
//        }
    }
}