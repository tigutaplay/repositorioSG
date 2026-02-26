public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void estado() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);

    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar");
        } else {
            System.out.println("estou rabiscando");
        }
    }

    public void destampar() {
        this.tampada = false;
    }

    public void tampar() {
        this.tampada = true;
    }
}
