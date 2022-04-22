
package aula07;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int     rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && (l1 != l2))  {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if(this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
        }else {
            System.out.println("Luta n?o pode acontecer");
        }
    }
    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public int getRounds() {
        return this.rounds;
    }
    
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public boolean getAprovada() {
        return this.aprovada;
    }
}
