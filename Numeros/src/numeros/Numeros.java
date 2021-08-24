/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = scanner.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = scanner.next();
        } while (resp.equalsIgnoreCase("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
