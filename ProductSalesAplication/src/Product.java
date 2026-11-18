public class Product implements IProducts {

    private int[][] sales;
    private String[] products;

    public Product(int[][] sales, String[] products) {
        this.sales = sales;
        this.products = products;
    }

    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    @Override
    public double GetAverageProductsSold() {

        int total = GetTotalProductsSold();

        return (double) total / products.length;
    }

    @Override
    public String GetMostPopularProduct() {

        int highest = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highest) {
                highest = productTotal;
                popularIndex = i;
            }
        }

        return products[popularIndex] + " (" + highest + ")";
    }
}
