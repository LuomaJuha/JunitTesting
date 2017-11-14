/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junittesting;

import org.junit.Test;

/**
 *
 * @author Suolapurkki
 */
public class JunitTesting {
    
    public int Age;
    
    @Test
    public void DoCalculations(int test){
        for(int i = 5; i > 0; i--){
            int result = i / test;
        }
    }
    
    @Test
    public void DoNothing(){
        
    }
    
    
}
