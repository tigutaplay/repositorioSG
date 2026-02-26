import java.util.HashMap;
import java.util.Properties;
import java.util.TreeMap;

public class Main {
    private static Properties map;

    public static void main(String[] args) {
        map.put("Thiago", 20);
        map.put("Gustavo", 16);
        map.put("Augusto", 17);
        System.out.println(map.get("Gustavo"));
        System.out.println(map.get("Thiago"));
        map.remove("Thiago");
        System.out.println(map.get("Thiago"));



        System.out.println(" ");
    }
}