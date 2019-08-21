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
public class Aula13 {
    public static void main( String [] args){
        
        Scanner input = new Scanner(System.in);
    
        
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para Subtrair");
        System.out.println("Digite 3 para Multiplicar");
        System.out.println("Digite 4 para Dividir");
        
        
        int i = input.nextInt();
        
        System.out.println("Digite o primeiro numero");
        double num1 = input.nextDouble();
        
        System.out.println("Digite o Segundo numero");
        double num2 = input.nextDouble();
        
        if( i ==1 ){
        System.out.println( num1 + num2 );
        
        }else{
            if(i == 2){
                System.out.println( num1 - num2);
            }else{
                if(i ==3){
                    System.out.println(num1 * num2);
                     }else{
                if(i ==4){
                    System.out.println(num1 / num2);
                    
                }   
                }
            }
        }
    }
}