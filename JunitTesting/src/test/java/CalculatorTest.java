
import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.hamcrest.Matcher.*;
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
                 { -5 , 5}, { 15, 0 }, { 0, 15 }, { 32, 1 }, { 1513123, 5514 }, { -124124, 31 }, { 331, 423123 }  
           });
    }
    
    public @Rule
    ErrorCollector collector = new ErrorCollector();
    
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
        try{
             assertThat(calc.Add(Fa, Fb), is(calc.Add(Fb, Fa)));
        }catch(Throwable e){
            System.out.println("Report Error" + e);
            collector.addError(e);
        }
        
        try{
            assertThat(calc.Substract(Fa, Fb), is(-calc.Substract(Fb, Fa)));
        }catch(Throwable e){
            System.out.println("Report Error" + e);
            collector.addError(e);
        }
        
        try{
            assertThat(calc.Multiply(Fa, Fb), is(calc.Multiply(Fb, Fa)));
        }catch(Throwable e){
            System.out.println("Report Error" + e);
            collector.addError(e);
        }
        
        try{
            assertThat(calc.Divide(Fb, Fa), not(0));
        }catch(Throwable e){
            System.out.println("Report Error" + e);
            collector.addError(e);
        }
    }
    
}
