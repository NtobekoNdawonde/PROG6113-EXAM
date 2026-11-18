/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productsalesaplication;

/**
 *
 * @author ndawo
 */
public class ProductSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
package productsales;

import java.util.Scanner;

public class ProductSales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        String[] months = {"Month 1", "Month 2", "Month 3"};

        for (int i = 0; i < products.length; i++) {

            System.out.println("Enter sales for " + products[i]);

            for (int j = 0; j < months.length; j++) {

                System.out.print("Enter number of sales for "
                        + months[j] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        int[] productTotals = new int[products.length];

        int totalSales = 0;

        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < months.length; j++) {
                productTotals[i] += sales[i][j];
            }

            totalSales += productTotals[i];
        }

        double averageSales =
                (double) totalSales / products.length;

        int highestSales = productTotals[0];
        int popularProductIndex = 0;

        for (int i = 1; i < productTotals.length; i++) {

            if (productTotals[i] > highestSales) {
                highestSales = productTotals[i];
                popularProductIndex = i;
            }
        }

        System.out.println();
        System.out.println("*******************************");
        System.out.println("       PRODUCT SALES REPORT");
        System.out.println("*******************************");

        System.out.println("TOTAL PRODUCT SALES: "
                + totalSales);

        System.out.printf("AVERAGE PRODUCT SALES: %.2f%n",
                averageSales);

        System.out.println("MOST POPULAR PRODUCT: "
                + products[popularProductIndex]
                + " (" + highestSales + ")");

        System.out.println("*******************************");

        input.close();
    }