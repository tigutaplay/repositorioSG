public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, int  i, String s) {
        nome = n;
        idade = i;
        sexo = s;
    }

    public String getNome() {
        return nome;
    }

    public void fazerAniversario() {
        idade++;
    }
}
