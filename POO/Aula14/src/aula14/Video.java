
package aula14;


public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // Constructor
    public Video(String titulo) {
        setTitulo(titulo);
        setAvaliacao(1);
        setViews(0);
        setCurtidas(0);
        setReproduzindo(false);
    }
    
    // Getters and Setters
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAvaliacao() {
        return this.avaliacao;
    }
    
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    public int getViews() {
        return this.views;
    }
    
    public void setViews(int views) {
        this.views = views;
    }
    
    public int getCurtidas() {
        return this.curtidas;
    }
    
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    public boolean getReproduzindo() {
        return this.reproduzindo;
    }
    
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
