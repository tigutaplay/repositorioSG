import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    Conta conta = new Conta();
    Transacoes transacoes = new Transacoes();
    private int opcao;
    public boolean menuAtivo = true;

    public void menu() {
        System.out.println("-------MENU--------");
        System.out.println("1  Criar conta");
        System.out.println("2  Deletar conta");
        System.out.println("3  Tranferir");
        System.out.println("4  Sacar");
        System.out.println("5  Depositar");
        System.out.println("6  Sair");
        System.out.print("Opção: ");
        setOpcao(conta.intScanner());
    }

    public void seguirOpcao() {
        if (opcao == 1) {
            conta.criarConta();
        } else if (opcao == 2) {
            conta.fecharConta();
        } else if (opcao == 3) {
            transacoes.transferir();
        } else if (opcao == 4) {
            transacoes.sacar();
        } else if (opcao == 5) {
            transacoes.depositar();
        } else {
            setMenuAtivo(false);
        }
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public boolean isMenuAtivo() {
        return menuAtivo;
    }

    public void setMenuAtivo(boolean menuAtivo) {
        this.menuAtivo = menuAtivo;
    }
}
