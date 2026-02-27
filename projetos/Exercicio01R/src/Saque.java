import java.util.Scanner;

public class Saque implements Caixa {
    Scanner scanner = new Scanner(System.in);
    private float valor;
    private float valorFixo;
    private int cedulasDe200;
    private int cedulasDe100;
    private int cedulasDe50;
    private int cedulasDe20;
    private int cedulasDe10;
    private int cedulasDe5;
    private int cedulasDe2;
    private int cedulasDe1;
    private int cedulasDe050;
    private int cedulasDe025;
    private int cedulasDe010;
    private int cedulasDe005;
    private int cedulasDe001;

    private int getCedulasDe200() {
        return cedulasDe200;
    }

    private void setCedulasDe200(int cedulasDe200) {
        this.cedulasDe200 = cedulasDe200;
    }

    private int getCedulasDe100() {
        return cedulasDe100;
    }

    private void setCedulasDe100(int cedulasDe100) {
        this.cedulasDe100 = cedulasDe100;
    }

    private int getCedulasDe50() {
        return cedulasDe50;
    }

    private void setCedulasDe50(int cedulasDe50) {
        this.cedulasDe50 = cedulasDe50;
    }

    private int getCedulasDe20() {
        return cedulasDe20;
    }

    private void setCedulasDe20(int cedulasDe20) {
        this.cedulasDe20 = cedulasDe20;
    }

    private int getCedulasDe10() {
        return cedulasDe10;
    }

    private void setCedulasDe10(int cedulasDe10) {
        this.cedulasDe10 = cedulasDe10;
    }

    private int getCedulasDe5() {
        return cedulasDe5;
    }

    private void setCedulasDe5(int cedulasDe5) {
        this.cedulasDe5 = cedulasDe5;
    }

    private int getCedulasDe2() {
        return cedulasDe2;
    }

    private void setCedulasDe2(int cedulasDe2) {
        this.cedulasDe2 = cedulasDe2;
    }

    private int getCedulasDe1() {
        return cedulasDe1;
    }

    private void setCedulasDe1(int cedulasDe1) {
        this.cedulasDe1 = cedulasDe1;
    }

    private int getCedulasDe050() {
        return cedulasDe050;
    }

    private void setCedulasDe050(int cedulasDe050) {
        this.cedulasDe050 = cedulasDe050;
    }

    private int getCedulasDe025() {
        return cedulasDe025;
    }

    private void setCedulasDe025(int cedulasDe025) {
        this.cedulasDe025 = cedulasDe025;
    }

    private int getCedulasDe010() {
        return cedulasDe010;
    }

    public void setCedulasDe010(int cedulasDe010) {
        this.cedulasDe010 = cedulasDe010;
    }

    public int getCedulasDe005() {
        return cedulasDe005;
    }

    private void setCedulasDe005(int cedulasDe005) {
        this.cedulasDe005 = cedulasDe005;
    }

    private int getCedulasDe001() {
        return cedulasDe001;
    }

    private void setCedulasDe001(int cedulasDe001) {
        this.cedulasDe001 = cedulasDe001;
    }

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
                this.setCedulasDe200(this.getCedulasDe200() + 1);
            } else if (this.getValor() >= 100) {
                this.setValor(this.getValor() - 100);
                this.setCedulasDe100(this.getCedulasDe100() + 1);
            } else if (this.getValor() >= 50) {
                this.setValor(this.getValor() - 50);
                this.setCedulasDe50(this.getCedulasDe50() + 1);
            } else if (this.getValor() >= 20) {
                this.setValor(this.getValor() - 20);
                this.setCedulasDe20(this.getCedulasDe20() + 1);
            } else if (this.getValor() >= 10) {
                this.setValor(this.getValor() - 10);
                this.setCedulasDe10(this.getCedulasDe10() + 1);
            } else if (this.getValor() >= 5) {
                this.setValor(this.getValor() - 5);
                this.setCedulasDe5(this.getCedulasDe5() + 1);
            } else if (this.getValor() >= 2) {
                this.setValor(this.getValor() - 2);
                this.setCedulasDe2(this.getCedulasDe2() + 1);
            } else if (this.getValor() >= 1) {
                this.setValor(this.getValor() - 1);
                this.setCedulasDe1(this.getCedulasDe1() + 1);
            } else if (this.getValor() >= 0.5) {
                this.setValor(this.getValor() - 0.5f);
                this.setCedulasDe050(this.getCedulasDe050() + 1);
            } else if (this.getValor() >= 0.25) {
                this.setValor(this.getValor() - 0.25f);
                this.setCedulasDe025(this.getCedulasDe025() + 1);
            } else if (this.getValor() >= 0.10) {
                this.setValor(this.getValor() - 0.10f);
                this.setCedulasDe010(this.getCedulasDe010() + 1);
            } else if (this.getValor() >= 0.05) {
                this.setValor(this.getValor() - 0.05f);
                this.setCedulasDe005(this.getCedulasDe005() + 1);
            } else if (this.getValor() >= 0.01) {
                this.setValor(this.getValor() - 0.01f);
                this.setCedulasDe001(this.getCedulasDe001() + 1);
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
