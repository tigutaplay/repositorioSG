public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Isac");
        p2.setNome("Pedro");
        p3.setNome("Thiago");
        p4.setNome("Ana");

        p2.setCurso("Informática");
        p3.setSalario(2504.30f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}