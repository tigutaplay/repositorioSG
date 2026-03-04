public class Professor extends Pessoa {
    public String especialidade;
    public int salario;

    public void receberAumento(int aum) {
        salario += aum;
    }
}
