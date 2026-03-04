public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CC");
        p1.setDono("Gusta");
        p1.setNumConta(1506);
        p1.depositar(300);
        p1.sacar(200);
        p1.sacar(150);
        p1.fecharConta();

        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("CP");
        p2.setDono("Rapha");
        p2.setNumConta(1009);
        p2.depositar(500);
        p2.sacar(1000);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}