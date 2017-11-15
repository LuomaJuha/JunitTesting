/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junittesting;

/**
 *
 * @author Suolapurkki
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("Calculator software, junit and jenkins.");
        Calculator calc = new Calculator();
        
        for(int i = 0, k = 10; i < 10; i++, k--){
            System.out.println("Iteration : " + i + " <<<<<<<<<<");
            System.out.println("Add " + i + " + " + k + " = "+  calc.Add(i, k));
            System.out.println("Substract " + i + " - " + k + " = "+  calc.Substract(i, k));
            System.out.println("Multiply " + i + " * " + k + " = "+  calc.Multiply(i, k));
            System.out.println("Divide " + i + " / " + k + " = "+  calc.Divide(i, k));
            System.out.println("Pythagoras " + i + "^2 + " + k + "^2 = x^2 :"+  calc.Pythagoras((float)i, (float)k));
        }
    }
}
