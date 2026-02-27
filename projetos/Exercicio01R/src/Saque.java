import java.util.Scanner;

public class Saque implements Caixa {
    Scanner scanner = new Scanner(System.in);
    private float valor;
    private float valorFixo;
    int[] cedulas = new int[13];

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

    private void filtro() {
        do {
            if (this.getValor() >= 200) {
                this.setValor(this.getValor() - 200);
                this.cedulas[0] + 1;
            } else if (this.getValor() >= 100) {
                this.setValor(this.getValor() - 100);
                this.cedulas[1] + 1;
            } else {
                //System.out.println(this.getValor());
                this.setValor(0);
            }
        } while(this.getValor() > 0);
    }

    @Override
    public void insereirValor() {
        System.out.println("Inserir valor a ser sacado: ");
        this.setValor(scanner.nextFloat());
        this.setValorFixo(this.getValor());
        filtro();
    }

    @Override
    public void sacar() {
        System.out.print("Valor do saque: ");
        System.out.println(this.getValorFixo());
        System.out.println(this.getValor());
        System.out.println("Cedulas de 200.: " + this.getCedulasDe200());
        System.out.println("Cedulas de 100.: " + this.getCedulasDe100());
        System.out.println("Cedulas de 50..: " + this.getCedulasDe50());
        System.out.println("Cedulas de 20..: " + this.getCedulasDe20());
        System.out.println("Cedulas de 10..: " + this.getCedulasDe10());
        System.out.println("Cedulas de 5...: " + this.getCedulasDe5());
        System.out.println("Cedulas de 2...: " + this.getCedulasDe2());
        System.out.println("Cedulas de 1...: " + this.getCedulasDe1());
        System.out.println("Cedulas de 0,50: " + this.getCedulasDe050());
        System.out.println("Cedulas de 0,25: " + this.getCedulasDe025());
        System.out.println("Cedulas de 0,10: " + this.getCedulasDe010());
        System.out.println("Cedulas de 0,05: " + this.getCedulasDe005());
        System.out.println("Cedulas de 0,01: " + this.getCedulasDe001());
    }
}
