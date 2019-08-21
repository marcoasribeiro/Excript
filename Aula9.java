/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Aula9 {
    public static void main( String [] args){
        
        Scanner input = new Scanner(System.in);
        
        double num1, num2, soma, subtracao , multiplicacao , div;
        
        System.out.println("insira um numero ");
        num1 = input.nextDouble();
        
        System.out.println("insira outro numero ");
        num2 = input.nextDouble();
        
        soma = num1 + num2;
        System.out.println(" o resultado da soma é: "+ soma);
                
                
        subtracao = num1 - num2;        
        System.out.println( "O resultada da subratracao e : "+subtracao);
        
        multiplicacao = num1 * num2;        
        System.out.println( "O resultada da multiplicacao e : "+multiplicacao);
    
        div = num1 / num2;        
        System.out.println( "O resultada da divisao e : "+div);
    
    }
    
}
