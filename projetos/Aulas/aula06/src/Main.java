public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.ligarMudo();
        c.maisvolume();
        c.ligarMudo();
        c.desligarMudo();
        c.maisvolume();
        c.maisvolume();
        c.abrirMenu();
    }
}