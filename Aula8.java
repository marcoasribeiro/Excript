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
public class Aula8 {
    public static void main(String [] args){
        
        
        System.out.println("Qual a idade do seu cachorro ");
        Scanner input = new Scanner(System.in);
        
        int dog = input.nextByte();
        dog =  dog * 7;
        
                
        System.out.println("Seu Dog tem : " + dog+ "anos");
        
    }
    
}
