import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[5];
        Arrays.fill(num, 5);

        for (int i=0; i<num.length; i++) {
            num[i] = i+1;
        }
//
//        for (int idade: idades) {
//            System.out.println(idade);
//        }

//        String[] letras = new String[5];
//        Arrays.fill(letras, "A");
//        Arrays.fill(letras, "B");
//
//        for (String letra: letras) {
//            System.out.println(letra);
//        }

        String[] nomes = new String[5];

        nomes[0] = "A";
        nomes[1] = "B";
        nomes[2] = "C";
        nomes[3] = "D";
        nomes[4] = "E";

        for (int i=0; i<num.length; i++) {
            System.out.println(nomes[i] + num[i]);
        }

//        for (String nome: nomes) {
//            System.out.println(nome);
//        }

    }
}