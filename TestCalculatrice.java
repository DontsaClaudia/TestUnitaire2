import static org.junit.Assert.*;

import org.junit.Test;
import Controlers.ArgumentException;
import Controlers.Calculatrice;

public class TestCalculatrice {
    
    

    @Test
    public void testAdd() {
        
        assertEquals( 10, Calculatrice.add(null, 2));
        ArgumentException.isNull(10,2);

        
    }

     @Test
        public void testAddNull() {
        
        assertThrows(NullPointerException.class, ()-> {Calculatrice.add(2, null);} );
        

        
    }


    @Test
    public void testMoins() {
        
        assertEquals(2, Calculatrice.moins(8, 6));
        assertTrue("soustraction effectuée",Calculatrice.moins(8, 6) == 2) ;
    }

    @Test
    public void testMulti() {
        
        assertEquals(12, Calculatrice.multi(2, 6));
    }

    @Test
    public void testDiv() {
        
        assertEquals(2, Calculatrice.div(8, 4));
    }

    @Test
    public void testDivisionParZero() {
        try {
            Calculatrice.div(5, 0);
            fail("le test aurait du echouer");
        } catch (ArithmeticException e) {
           
        }
    }
}
