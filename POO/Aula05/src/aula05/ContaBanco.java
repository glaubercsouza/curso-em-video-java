package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta() {
        status = true;
        if (tipo == "CC" || tipo == "cc") {
            saldo = saldo + 50;
        } else if (tipo == "CP" || tipo == "cp") {
            saldo = saldo + 150;
        }
    }
    
    public void fecharConta() {
       if(saldo < 0) {
           System.out.println("Impossível fechar conta. O saldo é negativo.");
       } else {
           saldo = 0;
           status = false;
           System.out.println("CONTA FECHADA COM SUCESSO");
       }
    }
    
    public void depositar(int deposito) {
        if (this.status == false) {
            System.out.println("Impossível depositar. Conta está fechada.");
        } else {
            saldo = saldo + deposito;
        }
    }
    
    public void sacar(int saque) {
        if (status == false) {
            System.out.println("Impossível sacar. Conta está fechada.");
        }else if (saldo < saque) {;
            System.out.println("Impossível sacar. Saldo indisponível.");
        }else {
            saldo = saldo - saque;
        }
    }
    
    public void pagarMensal() {
        if (tipo == "CC" || tipo == "cc") {
            saldo = saldo - 12;
        } else {
            saldo = saldo - 20;
        }
    }
    
    public void status() {
        System.out.println(getTipo() + " pertencente a " + getDono() + ", com saldo de R$ " + getSaldo());
        System.out.println("A conta está aberta? " + isStatus());
    }
}
