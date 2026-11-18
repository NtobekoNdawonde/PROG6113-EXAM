package productsalesaplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class MattressSalesTest {

    @Test
    public void testCalculateVAT() {
        double result = MattressCalculations.calculateVAT(2000);
        assertEquals(300.00, result, 0.01);
    }

    @Test
    public void testCalculateCommission() {
        double result = MattressCalculations.calculateCommission(2000);
        assertEquals(100.00, result, 0.01);
    }

    @Test
    public void testCalculateTotal() {
        double result = MattressCalculations.calculateTotal(2000);
        assertEquals(2400.00, result, 0.01);
    }
}