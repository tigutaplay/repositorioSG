public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gustavo", 16, "Masculino");
        p1.fazerAniversario();

        Livro l1 = new Livro("A","B",100, p1);
        l1.detalhes();
        l1.fechar();
        l1.avancarPag();
        l1.abrir();
        l1.avancarPag();
        l1.volatPag();
        l1.volatPag();
        l1.folear(101);
        l1.avancarPag();
        l1.fechar();
        l1.folear(50);
        l1.detalhes();
    }
}