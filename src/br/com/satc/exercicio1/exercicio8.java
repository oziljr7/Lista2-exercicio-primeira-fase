/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celcius;
        Scanner input = new Scanner(System.in);
        for (int i = 50; i < 150; i++) {
            celcius = (9 / 5) * (i - 32);
            System.out.println("Os graus celcius são: " + celcius + ".");
        }

    }

}
