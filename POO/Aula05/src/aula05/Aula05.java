package aula05;

public class Aula05 {

    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco(1, "CP", "Jubileu");
       
       /*c1.abrirConta();
       c1.depositar(300);
       c1.pagarMensal();
       c1.fecharConta();
       c1.status();*/

       ContaBanco c2 = new ContaBanco(2, "CC", "Creuza");
       c2.abrirConta();
       c2.depositar(500);
       c2.sacar(100);
       c2.pagarMensal();
       c2.fecharConta();
       c2.status();
    }
    
    
}
