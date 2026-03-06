import java.util.Scanner;

public class Menu {
    private int opcao;
    public boolean menuAtivo = true;
    Transacoes transacoes = new Transacoes();

    public void menu() {
        System.out.println("-------MENU--------");
        System.out.println("1  Criar conta");
        System.out.println("2  Deletar conta");
        System.out.println("3  Tranferir");
        System.out.println("4  Sacar");
        System.out.println("5  Depositar");
        System.out.println("6  Sair");
        System.out.print("Opção: ");
        opcao = Scanners.intScanner();
    }

    public void seguirOpcao() {
        if (opcao == 1) {
            Banco.adicionarConta();
        } else if (opcao == 2) {
            Banco.removerConta();
        } else if (opcao == 3) {
            transacoes.transferir();
        } else if (opcao == 4) {
            transacoes.sacar();
        } else if (opcao == 5) {
            transacoes.depositar();
        } else {
            if (Scanners.confirmacaoScanner()) {
                System.out.println("Programa encerrado!");
                setMenuAtivo(false);
            }
        }
    }

    public boolean isMenuAtivo() {
        return menuAtivo;
    }

    public void setMenuAtivo(boolean menuAtivo) {
        this.menuAtivo = menuAtivo;
    }
}
