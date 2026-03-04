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
    private int qCedulasDe200 = 5;
    private int qCedulasDe100 = 5;
    private int qCedulasDe50 = 5;
    private int qCedulasDe20 = 5;
    private int qCedulasDe10 = 5;
    private int qCedulasDe5 = 5;
    private int qCedulasDe2 = 5;
    private int qCedulasDe1 = 5;
    private int qCedulasDe050 = 5;
    private int qCedulasDe025 = 5;
    private int qCedulasDe010 = 5;
    private int qCedulasDe005 = 5;
    private int qCedulasDe001 = 5;

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

    public int getqCedulasDe200() {
        return qCedulasDe200;
    }

    public void setqCedulasDe200(int qCedulasDe200) {
        this.qCedulasDe200 = qCedulasDe200;
    }

    public int getqCedulasDe100() {
        return qCedulasDe100;
    }

    public void setqCedulasDe100(int qCedulasDe100) {
        this.qCedulasDe100 = qCedulasDe100;
    }

    public int getqCedulasDe50() {
        return qCedulasDe50;
    }

    public void setqCedulasDe50(int qCedulasDe50) {
        this.qCedulasDe50 = qCedulasDe50;
    }

    public int getqCedulasDe20() {
        return qCedulasDe20;
    }

    public void setqCedulasDe20(int qCedulasDe20) {
        this.qCedulasDe20 = qCedulasDe20;
    }

    public int getqCedulasDe10() {
        return qCedulasDe10;
    }

    public void setqCedulasDe10(int qCedulasDe10) {
        this.qCedulasDe10 = qCedulasDe10;
    }

    public int getqCedulasDe5() {
        return qCedulasDe5;
    }

    public void setqCedulasDe5(int qCedulasDe5) {
        this.qCedulasDe5 = qCedulasDe5;
    }

    public int getqCedulasDe2() {
        return qCedulasDe2;
    }

    public void setqCedulasDe2(int qCedulasDe2) {
        this.qCedulasDe2 = qCedulasDe2;
    }

    public int getqCedulasDe1() {
        return qCedulasDe1;
    }

    public void setqCedulasDe1(int qCedulasDe1) {
        this.qCedulasDe1 = qCedulasDe1;
    }

    public int getqCedulasDe050() {
        return qCedulasDe050;
    }

    public void setqCedulasDe050(int qCedulasDe050) {
        this.qCedulasDe050 = qCedulasDe050;
    }

    public int getqCedulasDe025() {
        return qCedulasDe025;
    }

    public void setqCedulasDe025(int qCedulasDe025) {
        this.qCedulasDe025 = qCedulasDe025;
    }

    public int getqCedulasDe010() {
        return qCedulasDe010;
    }

    public void setqCedulasDe010(int qCedulasDe010) {
        this.qCedulasDe010 = qCedulasDe010;
    }

    public int getqCedulasDe005() {
        return qCedulasDe005;
    }

    public void setqCedulasDe005(int qCedulasDe005) {
        this.qCedulasDe005 = qCedulasDe005;
    }

    public int getqCedulasDe001() {
        return qCedulasDe001;
    }

    public void setqCedulasDe001(int qCedulasDe001) {
        this.qCedulasDe001 = qCedulasDe001;
    }

    private void filtro() {
        do {
            if (this.getValor() >= 200 && this.qCedulasDe200 > 0) {
                this.setValor(this.getValor() - 200);
                this.setCedulasDe200(this.getCedulasDe200() + 1);
                this.setqCedulasDe200(this.getqCedulasDe200() - 1);
            } else if (this.getValor() >= 100 && this.qCedulasDe100 > 0) {
                this.setValor(this.getValor() - 100);
                this.setCedulasDe100(this.getCedulasDe100() + 1);
                this.setqCedulasDe100(this.getqCedulasDe100() - 1);
            } else if (this.getValor() >= 50 && this.qCedulasDe50 > 0) {
                this.setValor(this.getValor() - 50);
                this.setCedulasDe50(this.getCedulasDe50() + 1);
                this.setqCedulasDe50(this.getqCedulasDe50() - 1);
            } else if (this.getValor() >= 20 && this.qCedulasDe20 > 0) {
                this.setValor(this.getValor() - 20);
                this.setCedulasDe20(this.getCedulasDe20() + 1);
                this.setqCedulasDe20(this.getqCedulasDe20() - 1);
            } else if (this.getValor() >= 10 && this.qCedulasDe10 > 0) {
                this.setValor(this.getValor() - 10);
                this.setCedulasDe10(this.getCedulasDe10() + 1);
                this.setqCedulasDe10(this.getqCedulasDe10() - 1);
            } else if (this.getValor() >= 5 && this.qCedulasDe5 > 0) {
                this.setValor(this.getValor() - 5);
                this.setCedulasDe5(this.getCedulasDe5() + 1);
                this.setqCedulasDe5(this.getqCedulasDe5() - 1);
            } else if (this.getValor() >= 2 && this.qCedulasDe2 > 0) {
                this.setValor(this.getValor() - 2);
                this.setCedulasDe2(this.getCedulasDe2() + 1);
                this.setqCedulasDe2(this.getqCedulasDe2() - 1);
            } else if (this.getValor() >= 1 && this.qCedulasDe1 > 0) {
                this.setValor(this.getValor() - 1);
                this.setCedulasDe1(this.getCedulasDe1() + 1);
                this.setqCedulasDe1(this.getqCedulasDe1() - 1);
            } else if (this.getValor() >= 0.5 && this.qCedulasDe050 > 0) {
                this.setValor(this.getValor() - 0.5f);
                this.setCedulasDe050(this.getCedulasDe050() + 1);
                this.setqCedulasDe050(this.getqCedulasDe050() - 1);
            } else if (this.getValor() >= 0.25 && this.qCedulasDe025 > 0) {
                this.setValor(this.getValor() - 0.25f);
                this.setCedulasDe025(this.getCedulasDe025() + 1);
                this.setqCedulasDe025(this.getqCedulasDe025() - 1);
            } else if (this.getValor() >= 0.10 && this.qCedulasDe010 > 0) {
                this.setValor(this.getValor() - 0.10f);
                this.setCedulasDe010(this.getCedulasDe010() + 1);
                this.setqCedulasDe010(this.getqCedulasDe010() - 1);
            } else if (this.getValor() >= 0.05 && this.qCedulasDe005 > 0) {
                this.setValor(this.getValor() - 0.05f);
                this.setCedulasDe005(this.getCedulasDe005() + 1);
                this.setqCedulasDe005(this.getqCedulasDe005() - 1);
            } else if (this.getValor() >= 0.01 && this.qCedulasDe001 > 0) {
                this.setValor(this.getValor() - 0.01f);
                this.setCedulasDe001(this.getCedulasDe001() + 1);
                this.setqCedulasDe001(this.getqCedulasDe001() - 1);
            } else {
                System.out.println(this.getValor());
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
        System.out.println("------------------");
        System.out.println("Cedulas de 200 restante.: " + this.getqCedulasDe200());
        System.out.println("Cedulas de 100 restante.: " + this.getqCedulasDe100());
        System.out.println("Cedulas de 50 restante..: " + this.getqCedulasDe50());
        System.out.println("Cedulas de 20 restante..: " + this.getqCedulasDe20());
        System.out.println("Cedulas de 10 restante..: " + this.getqCedulasDe10());
        System.out.println("Cedulas de 5 restante...: " + this.getqCedulasDe5());
        System.out.println("Cedulas de 2 restante...: " + this.getqCedulasDe2());
        System.out.println("Cedulas de 1 restante...: " + this.getqCedulasDe1());
        System.out.println("Cedulas de 0,50 restante: " + this.getqCedulasDe050());
        System.out.println("Cedulas de 0,25 restante: " + this.getqCedulasDe025());
        System.out.println("Cedulas de 0,10 restante: " + this.getqCedulasDe010());
        System.out.println("Cedulas de 0,05 restante: " + this.getqCedulasDe005());
        System.out.println("Cedulas de 0,01 restante: " + this.getqCedulasDe001());

    }
}
