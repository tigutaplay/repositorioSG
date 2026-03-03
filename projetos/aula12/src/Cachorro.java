public class Cachorro extends Mamifero {


    public void enerrarOsso() {
        System.out.println("Osso enterrado");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
}
