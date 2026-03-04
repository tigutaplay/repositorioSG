public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Abacate", "B",1,1,60,1,2,3);
        l[1] = new Lutador("Banana", "B",1,1,60,1,2,2);
        l[2] = new Lutador("C", "B",1,1,80,2,1,3);
        l[3] = new Lutador("D", "B",1,1,80,2,1,2);
        l[4] = new Lutador("E", "B",1,1,100,3,2,1);
        l[5] = new Lutador("F", "B",1,1,100,3,2,2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[5], l[4]);
        UEC01.lutar();
        l[5].status();
        l[4].status();


    }
}