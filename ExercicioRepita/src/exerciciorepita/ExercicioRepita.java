/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, pares = 0, impares = 0, acimaDeCem = 0, c = 0;
        double media = 0, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe um número: (valor 0 interrompe)"));
            if (n != 0) {
                s += n;
                c++;
                if (n % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                if (n > 100) {
                    acimaDeCem++;
                }
                media = s / c;
            }
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado<hr><br>"
                + "Total de Valores: " + c
                + "<br>Total de Pares: " + pares
                + "<br>Total de Ímpares: " + impares
                + "<br>Acima de 100: " + acimaDeCem
                + "<br>Média dos valores: " + media + "</html>");
    }

}
