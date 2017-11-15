
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suolapurkki
 */
@RunWith(Parameterized.class)
public class CalculatorTest{
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { -5 , 5}, { 15, 0 }, { 0, 15 }, { 32, 1 }, { 1513123, 5514 }, { -124124, 31 }, { 331.2, 423123 }  
           });
    }
    
    
    
    private int Fa;
    private int Fb;
    
    Calculator calc;
    
    @Before
    public void Init(){
        calc = new Calculator();
    }
    
    public CalculatorTest(int fa, int fb) {
        Fa = fa;
        Fb= fb;
    }
    
    @Test
    public void Test(){
        assertEquals(calc.Add(Fa, Fb), calc.Add(Fb, Fa));
        assertEquals(calc.Substract(Fa, Fb), calc.Substract(Fb, Fa));
        assertEquals(calc.Multiply(Fa, Fb), calc.Multiply(Fb, Fa));
        assertEquals((calc.Divide(Fa, Fb) != 0), calc.Divide(Fb, Fa));
    }
    
}
