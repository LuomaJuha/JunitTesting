
import org.junit.Test;
import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//

/**
 *
 * @author Suolapurkki
 */
@RunWith(Theories.class)
public class JunitTest {
    
    
    public JunitTest() {
    }
    
    @Test
    public void PrintHi(){
        System.out.println("First hi in console!");
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
