
package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura() {
        return this.altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    
    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    public int getVitorias() {
        return this.vitorias;
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public int getDerrotas() {
        return this.derrotas;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return this.empates;
    }
    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar() {
        System.out.println("===================================================");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura e");
        System.out.println("pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " vitóras");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
