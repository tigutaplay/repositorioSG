public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.emitirSom();
        c.reagir("Olá");
        c.reagir("Sai");
        c.reagir(22);
        c.reagir(10);
        c.reagir(14);
        c.reagir(3, 4);
        c.reagir(3,11.1f);
        c.reagir(6, 6.2f);
        c.reagir(6, 11);
        c.reagir(true);
        c.reagir(false);
    }
}