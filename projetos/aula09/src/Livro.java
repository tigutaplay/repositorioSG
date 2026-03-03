public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String t, String a, int p, Pessoa l) {
        titulo = t;
        autor = a;
        totPaginas = p;
        leitor = l;
        aberto = false;
        pagAtual = 0;
    }

    public void detalhes() {
        System.out.println("------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " +totPaginas);
        System.out.println("Página atual: " + pagAtual);
        System.out.println("Aberto: " + aberto);
        System.out.println("Leitor: " + leitor.getNome());
    }

    @Override
    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("Livro aberto");
        } else {
            System.out.println("Já está aberto");
        }
    }

    @Override
    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("Livro fechado");
        } else {
            System.out.println("Já está fechado");
        }
    }

    @Override
    public void folear(int p) {
        if (aberto) {
            if (p > totPaginas) {
                System.out.println("Superior ao limite de páginas");
            }
            pagAtual = totPaginas;
            System.out.println("Página: " + pagAtual);
        } else {
            System.out.println("Abra o livro primeiro");
        }
    }

    @Override
    public void avancarPag() {
        if (aberto) {
            if (pagAtual < totPaginas) {
                pagAtual++;
                System.out.println("Página atual: " + pagAtual);
            } else {
                System.out.println("Voce já chegou ao fim");
            }
        } else {
            System.out.println("Abra o livro");
        }
    }

    @Override
    public void volatPag() {
        if (aberto) {
            if (pagAtual > 0) {
                pagAtual--;
                System.out.println("Página atual: " + pagAtual);
            } else {
                System.out.println("Você já está no início");
            }
        } else {
            System.out.println("Abra o livro");
        }
    }
}
