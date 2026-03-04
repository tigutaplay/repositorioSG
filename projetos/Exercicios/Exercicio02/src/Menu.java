import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private int opcao;
    Conta conta = new Conta();

    public void menu() {
        System.out.println("-------MENU--------");
        System.out.println("1  Criar conta");
        System.out.println("2  Deletar conta");
        System.out.println("3  Tranferir");
        System.out.println("4  Sacar");
        System.out.println("5  Depositar");
        System.out.println("6  Sair");
        System.out.print("Opção: ");
        setOpcao(scanner());
    }

    public void seguirOpcao() {
        if (opcao == 1) {
            conta.criarConta();
        } else if (opcao == 2) {

        } else if (opcao == 3) {

        } else if (opcao == 4) {

        } else if (opcao == 5) {

        } else {

        }
    }

    private int scanner() {
        return scanner.nextInt();
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
}
