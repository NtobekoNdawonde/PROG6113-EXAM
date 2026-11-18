package test;

import org.junit.Test;
import static org.junit.Assert.*;
import productsalesaplication.ProductSales;

public class ProductSalesTest {

    @Test
    public void GetTotalProductsSales_WithValidData_ReturnsCorrectValue() {

        int[][] sales = {
            {10, 20, 30},
            {15, 25, 35},
            {5, 10, 15}
        };

        int result = ProductSales.GetTotalProductsSales(sales);

        assertEquals(165, result);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        int[][] sales = {
            {10, 20, 30},
            {15, 25, 35},
            {5, 10, 15}
        };

        double result = ProductSales.GetAverageSales(sales);

        assertEquals(55.0, result, 0.01);
    }
}
