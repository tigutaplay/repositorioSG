public class Usuario extends Pessoa {
    private String login;
    private int totAssistido;

    public Usuario(String n, int i, String s, String l) {
        super(n, i, s);
        login = l;
        totAssistido = 0;
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

    public void viuMaisUm() {

    }
}
