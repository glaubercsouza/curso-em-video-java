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
        this.setSaldo(0);
        this.setStatus(false); 
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
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(getTipo()) || "cc".equals(getTipo())) {
            this.setSaldo(50);
            System.out.println("CONTA ABERTA COM SUCESSO!");
        } else if ("CP".equals(getTipo()) || "cp".equals(getTipo())) {
            this.setSaldo(150);
            System.out.println("CONTA ABERTA COM SUCESSO!");
        }
    }
    
    public void fecharConta() {
       if(this.getSaldo() < 0) {
           System.out.println("Impossível fechar conta. O saldo é negativo.");
       } else if(this.getSaldo() > 0) {
           System.out.println("Impossível fechar a conta. Saque o dinheiro primeiro.");
       }else {
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO!");
        }
    }
    
    public void depositar(int deposito) {
        if (this.isStatus() == false) {
            System.out.println("Impossível depositar. Conta está fechada.");
        } else {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("DEPÓSITO DE R$ " + deposito + " REALIZADO COM SUCESSO!");
        }
    }
    
    public void sacar(int saque) {
        if (this.isStatus() == false) {
            System.out.println("Impossível sacar. Conta está fechada.");
        }else if (this.getSaldo() < saque) {;
            System.out.println("Impossível sacar. Saldo indisponível.");
        }else {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("SAQUE DE R$ " + saque + " REALIZADO COM SUCESSO!");
        }
    }
    
    public void pagarMensal() {
        if (this.isStatus()== true){
            if (tipo == "CC" || tipo == "cc") {
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("MENSALIDADE PAGA COM SUCESSO!");
            }   else {
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("MENSALIDADE PAGA COM SUCESSO!");
            }
        } else {
            System.out.println("A conta está fechada");
        }  
    }
    
    public void status() {
        System.out.println("==============================================");
        System.out.println(getTipo() + " pertencente a " + getDono() + ", com saldo de R$ " + getSaldo());
        System.out.println("A conta está aberta? " + isStatus());
        System.out.println("==============================================");
    }
}
