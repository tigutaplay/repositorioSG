public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("A");
        v[1] = new Video("B");
        v[2] = new Video("C");

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("A", 12, "M", "a");
        u[1] = new Usuario("B", 21, "F", "b");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(u[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(u[0], v[1]);
        vis[1].avaliar(2);
        System.out.println(vis[1].toString());
        vis[1].getEspectador().ganharExp();
        vis[1].getFilme().setCurtidas(1);
        System.out.println(u[0].toString());
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());

    }
}