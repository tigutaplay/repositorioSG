public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void estado() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);

    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar");
        } else {
            System.out.println("estou rabiscando");
        }
    }

    void destampar() {
        this.tampada = false;
    }

    void tampar() {
        this.tampada = true;
    }
}
