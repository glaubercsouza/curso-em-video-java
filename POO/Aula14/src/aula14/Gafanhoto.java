
package aula14;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        setLogin(login);
        setTotAssistido(0);
    }
    
    public void viuMaisUm() {
        setTotAssistido(getTotAssistido() + 1);
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public int getTotAssistido() {
        return this.totAssistido;
    }
    
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
