public class Video implements AcoesVideo {
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String t) {
        titulo = t;
        avaliacao = 1;
        views = 0;
        curtidas = 0;
        reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = (int) (this.avaliacao + avaliacao)/ this.views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (!reproduzindo) {
            reproduzindo = true;
            System.out.println("Reproduzindo");
        } else {
            System.out.println("Já está reproduzindo");
        }
    }

    @Override
    public void pause() {
        if (reproduzindo) {
            reproduzindo = false;
            System.out.println("Pausado");
        } else {
            System.out.println("Já está pausadp");
        }
    }

    @Override
    public void like() {
        curtidas++;
        System.out.println("Like adicionado");
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
