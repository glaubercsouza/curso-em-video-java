
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
    
    public void Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
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
        setCategoria();
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inv�lido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9) {
            this.categoria = "M�dio";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inv�lido";
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
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + getPeso() + " Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    
    public void status() {
        System.out.println(getNome());
        System.out.println("� um peso" + getCategoria());
        System.out.println(getVitorias() + " vit�rias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
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
