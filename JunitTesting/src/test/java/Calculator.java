/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.junittesting.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
/**
 *
 * @author Suolapurkki
 */
@RunWith(Theories.class)
public class Calculator {
    
    @DataPoints
    public static int[] integers() {
        return new int[] { 0, -5, 5, 25, -25};
    }

    @Theory
    public void Add(int a, int b){
        assertTrue(a + b == b + a);
        //return a + b;
    }
    
    @Theory
    public void Substract(int a, int b){
        assertTrue(a - b != b - a);
        //return a - b;
    }
    
    @Theory
    public void Multiply(int a, int b){
        assertTrue(a * b == b * a);
        //return a * b;
    }
    
    @Theory
    public void Divide(int a, int b){
        assertTrue(a / b != b / a);
        //return a / b;
    }
    
    @Theory
    public void Pythagoras(float a, float b){
        assertTrue(Math.sqrt(a * a + b * b) != 0);
        //return Math.sqrt(a * a + b * b);
    }
}
