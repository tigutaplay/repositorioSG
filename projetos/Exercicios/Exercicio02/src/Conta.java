import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Conta {
    private Scanner scanner = new Scanner(System.in);
    public static HashMap<Integer, Integer> idParaAgencia = new LinkedHashMap<>();
    public static HashMap<Integer, String> idParaNome = new LinkedHashMap<>();
    public static HashMap<Integer, Integer> idParaConta = new LinkedHashMap<>();
    public static HashMap<Integer, BigDecimal> idParaSaldo = new LinkedHashMap<>();
    public static HashMap<Integer, Integer> idParaStatus = new LinkedHashMap<>();
    private static int contador = 1;

    private String stringScanner() {
        return scanner.next();
    }

    public int intScanner() {
        return scanner.nextInt();
    }

    private boolean confirmacaoScanner() {
        System.out.print("[1]Sim [0]Não: ");
        int valor = scanner.nextInt();
        if (valor == 1) {
            return true;
        } else if (valor == 0){
            return false;
        } else {
            confirmacaoScanner();
            return false;
        }
    }

    public void criarConta() {
        System.out.print("Número da agencia: ");
        idParaAgencia.put(contador, intScanner());

        System.out.print("Nome do titular: ");
        idParaNome.put(contador, stringScanner());

        System.out.println("Número da conta: " + contador);
        idParaConta.put(contador, contador);
        idParaSaldo.put(contador, BigDecimal.valueOf(0));
        idParaStatus.put(contador++, 1);
    }

    public void fecharConta() {
        int idConta = identificarConta();
        if (idConta != 0) {
            System.out.println("Conta de número " + idParaConta.get(idConta) + " do usuário " + idParaNome.get(idConta));
            System.out.println("Confirmar fechamento da conta?");
            if (confirmacaoScanner()) {
                if (idParaSaldo.get(idConta).compareTo(BigDecimal.ZERO) == 0) {
                    idParaAgencia.remove(idConta);
                    idParaNome.remove(idConta);
                    idParaConta.remove(idConta);
                    idParaSaldo.remove(idConta);
                    idParaStatus.remove(idConta);
                    System.out.println("Conta fechada!");
                } else if (idParaSaldo.get(idConta).compareTo(BigDecimal.ZERO) > 0) {
                    System.out.println("Operação inválida! Ainda há dineiro na conta!");
                }
            } else {
                System.out.println("Fechamento cancelado!");
            }
        }
    }

    public int identificarConta() {
        System.out.print("Número da conta: ");
        Integer idConta = intScanner();
        if (idParaConta.containsKey(idConta)) {
            return idConta;
        } else {
            System.out.println("Conta não encontrada!");
            return 0;
        }
    }

}