import java.util.*;

public class Main {
    private static Properties map;

    public static void main(String[] args) {

        HashMap<String, Integer> nomes = new LinkedHashMap<>();

        nomes.put("Thiago", 20);
        nomes.put("Gustavo", 16);
        nomes.put("Augusto", 17);
        System.out.println(nomes.get("Gustavo"));
        System.out.println(nomes.get("Thiago"));
        nomes.remove("Thiago");
        System.out.println(nomes.get("Thiago"));



        System.out.println(" ");
    }
}