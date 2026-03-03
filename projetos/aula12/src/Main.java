public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Cachorro cao = new Cachorro();
        Canguru k = new Canguru();
        Cobra cobra = new Cobra();
        Tartaruga t = new Tartaruga();
        PeixeDourado P = new PeixeDourado();
        Arara A = new Arara();

        m.setCorPelo("Preto");
        m.setMenbros(4);
        m.setIdade(5);
        m.locomover();

        r.setCorEscama("Verde");
        r.setMenbros(0);
        r.setPeso(10.5f);
        r.emitirSom();

        p.setCorEscama("Vermelho");
        p.setPeso(5.5f);
        p.alimentar();
        p.soltarBolha();

        a.setMenbros(4);
        a.setCorPena("Azul");
        a.locomover();
        a.fazerNinho();

        cao.enerrarOsso();
        cao.emitirSom();
        cao.locomover();

        k.locomover();
        k.usarBolsa();

        cobra.locomover();

        t.locomover();

        p.soltarBolha();

        A.locomover();
        A.fazerNinho();

        System.out.println(m.toString());
        System.out.println(r.toString());
        System.out.println(p.toString());
        System.out.println(a.toString());
    }
}