public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();

        v1.setNome("V");
        a1.setNome("A");
        p1.setNome("P");
        b1.setNome("B");
        t1.setNome("T");

        a1.pagarMensalidade();
        p1.receberAumento(123);
        b1.pagarMensalidade();
        b1.fazerAniversario();
        t1.fazerAniversario();
        t1.preticar();

        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
    }
}