package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
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
    
    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (getTipo() == "CC" || getTipo() == "cc") {
            setSaldo(50);
            System.out.println("CONTA ABERTA COM SUCESSO!");
        } else if (getTipo() == "CP" || getTipo() == "cp") {
            setSaldo(150);
            System.out.println("CONTA ABERTA COM SUCESSO!");
        }
    }
    
    public void fecharConta() {
       if(getSaldo() < 0) {
           System.out.println("Impossível fechar conta. O saldo é negativo.");
       } else if(getSaldo() > 0) {
           System.out.println("Impossível fechar a conta. Saque o dinheiro primeiro.");
       }else {
            setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO!");
        }
    }
    
    public void depositar(int deposito) {
        if (this.status == false) {
            System.out.println("Impossível depositar. Conta está fechada.");
        } else {
            setSaldo(getSaldo() + deposito);
            System.out.println("DEPÓSITO DE R$ " + deposito + " REALIZADO COM SUCESSO!");
        }
    }
    
    public void sacar(int saque) {
        if (status == false) {
            System.out.println("Impossível sacar. Conta está fechada.");
        }else if (getSaldo() < saque) {;
            System.out.println("Impossível sacar. Saldo indisponível.");
        }else {
            setSaldo(getSaldo() - saque);
            System.out.println("SAQUE DE R$ " + saque + " REALIZADO COM SUCESSO!");
        }
    }
    
    public void pagarMensal() {
        if (isStatus()== true){
            if (tipo == "CC" || tipo == "cc") {
                setSaldo(getSaldo() - 12);
                System.out.println("MENSALIDADE PAGA COM SUCESSO!");
            }   else {
                setSaldo(getSaldo() - 20);
                System.out.println("MENSALIDADE PAGA COM SUCESSO!");
            }
        } else {
            System.out.println("A conta está fechada");
        }  
    }
    
    public void status() {
        System.out.println(getTipo() + " pertencente a " + getDono() + ", com saldo de R$ " + getSaldo());
        System.out.println("A conta está aberta? " + isStatus());
    }
}
