import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testCalcRadius1(){
        double radius = App.calcRadius(30, 35);        
        assertEquals(8.60364654526569, radius);
    }
    @Test
    public void testCalcRadius2(){
        double expectedRadius = 29.53918647207887;    
        double actualRadius = App.calcRadius(103, 35);        
        assertEquals(expectedRadius, actualRadius);
    }
    @Test
    public void testCalcRadius3(){
        double expectedRadius = 0.008726203218641756;    
        double actualRadius = App.calcRadius(1, 1);        
        assertEquals(expectedRadius, actualRadius);
    }
}
