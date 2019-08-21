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
public class Aula12 {
    public static void main(String [] args){
        
        
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2 , nota3, nota4;
       
        
        
       
        
        System.out.println("Digite sua nota ");
        nota1 = input.nextDouble();
        
        System.out.println("Digite sua 2 nota ");
        nota2 = input.nextDouble();
        
        System.out.println("Digite sua 3 nota ");
        nota3 = input.nextDouble();
        
        System.out.println("Digite sua 4 nota ");
        nota4 = input.nextDouble();
        
        double  soma = nota1+nota2+nota3+nota4;
        double media = soma /4;
       // System.out.println(media);
        
        {
        
        if(media >= 7);{
        System.out.println("Aprovado" + media );
            }else{
   System.out.println("reprovado" + media );
                    }
     }
        }
        }
    

    
   



