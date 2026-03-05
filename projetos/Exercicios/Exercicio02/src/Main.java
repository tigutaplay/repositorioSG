public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        do {
            menu.menu();
            menu.seguirOpcao();
            if (!menu.isMenuAtivo()) break;
        } while (true);
    }
}