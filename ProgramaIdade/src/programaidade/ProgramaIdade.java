/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Qual é a sua idade?");
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int i = 2015 - nasc;
        if (i >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
}
}