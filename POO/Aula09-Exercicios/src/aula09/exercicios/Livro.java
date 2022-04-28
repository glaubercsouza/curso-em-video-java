package aula09.exercicios;

public class Livro implements Publicacao{
    private String  titulo;
    private String  autor;
    private int     totPaginas;
    private int     pagAtual;
    private boolean aberto;
    private Pessoa  leitor;
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public String detalhes() {
        return "Livro{\n" + "titulo=" + titulo + ", \nautor=" + autor + ", \ntotPaginas=" + totPaginas + ", \npagAtual=" + pagAtual + ", \naberto=" + aberto + ", \nleitor=" + leitor.getNome() + ", \nidade=" + leitor.getIdade() + ", \nsexo=" + leitor.getSexo() + '}';
    }
        
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    
    public int getTotPaginas() {
        return this.totPaginas;
    }
    
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    public int getPagAtual() {
        return this.pagAtual;
    }
    
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public boolean getAberto() {
        return this.aberto;
    }
    
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public Pessoa getLeitor() {
        return this.leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }
}
