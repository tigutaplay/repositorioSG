import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Conta extends Dados {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, Integer> idParaAgencia = new LinkedHashMap<>();
    HashMap<Integer, String> idParaNome = new LinkedHashMap<>();
    HashMap<Integer, Integer> idParaSaldo = new LinkedHashMap<>();
    HashMap<Integer, Integer> idParaStatus = new LinkedHashMap<>();
    private static int contador = 1;
    private int id;

    /*private int numeroAgencia;
    private String nomeTitular;
    private BigDecimal saldo;
    private boolean status;*/

    /*public Conta(int numeroAgencia, int numeroConta, String nomeTitular) {
        setNumeroAgencia(numeroAgencia);
        setNumeroConta(numeroConta);
        setNomeTitular(nomeTitular);
        setSaldo(BigDecimal.valueOf(0));
        setStatus(true);
        System.out.println("Conta aberta!");
    }*/


    private String stringScaner() {
        return scanner.next();
    }

    private int intScaner() {
        return scanner.nextInt();
    }

    public void criarConta() {
        System.out.print("Número da agencia: ");
        idParaAgencia.put(contador, intScaner());
        System.out.print("Nome do titular: ");
        idParaNome.put(contador, stringScaner());
        setId(contador);
        System.out.print("Número da conta: " + contador);
        idParaSaldo.put(contador, 0);
        idParaStatus.put(contador++, 1);
    }

    /*public void fecharConta() {
        if (getSaldo().compareTo(BigDecimal.ZERO) == 0) {
            setStatus(false);
            System.out.println("Conta fechada!");
        } else if (getSaldo().compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Operação inválida! Ainda há dinheiro na conta");
        } else {
            System.out.println("Operação inválida! Conta em débito");
        }
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }*/
}