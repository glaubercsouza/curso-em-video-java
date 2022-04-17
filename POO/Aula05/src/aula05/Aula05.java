package aula05;

public class Aula05 {

    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco(1, "Jubileu");  
       c1.status();
       c1.abrirConta("CC");
       c1.status();
       c1.depositar(300);
       c1.status();
       c1.pagarMensal();
       c1.status();
       c1.fecharConta();
       c1.status();
       c1.sacar(338);
       c1.status();
       c1.fecharConta();
       c1.status();

      ContaBanco c2 = new ContaBanco(2, "Creuza");
       c2.status();
       c2.abrirConta("CP");
       c2.status();
       c2.depositar(500);
       c2.status();
       c2.sacar(100);
       c2.status();
       c2.pagarMensal();
       c2.status();
       c2.fecharConta();
       c2.status();
       c2.sacar(530);
       c2.status();
       c2.fecharConta();
       c2.status();
    }
    
    
}
