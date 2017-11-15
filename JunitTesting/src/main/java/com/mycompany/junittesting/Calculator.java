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
public class Calculator {
    
    public int Add(int a, int b){
        return a + b;
    }
    
    public int Substract(int a, int b){
        return a - b;
    }
    
    public int Multiply(int a, int b){
        return a * b;
    }
    
    public int Divide(int a, int b){
        return a / b;
    }
    
    public double Pythagoras(float a, float b){
        return Math.sqrt(a * a + b * b);
    }
}
