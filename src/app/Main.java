package app;

public class Main {
    static String productName;
    //нигде не использую, но в условиях задачи есть:
//static double productQuantity;
//static double productPrice;
    //   static double profit;
    static int dayCount;
    static double dayProfit;
    static double totalProfit;

    public static void main(String[] args) {

        productName = "smartphone";
        //примерно здесь было бы, при наличии данных:
        //productPrice = х;
        //productQuantity = y;
        //profit = productPrice * productQuantity;
        dayCount = 5;
        totalProfit = 12153.41;
        dayProfit = totalProfit / dayCount;
        //вывод в консоль суммы продаж, как и количества/цены за шт не требуется по условиям.
        //System.out.printf("%nProduct No X: %s, %nPrice per unit: EUR %.2f.%nQuantity: %.0f units. %nProfit:
        //EUR %.2f. %nTotal profit: EUR %.2f. %nProfit per day: EUR %.2f. %n",
        //productName, productPrice, productQuantity, profit, totalProfit, dayProfit);
        System.out.printf("%nProduct No 1: %s," +
                        "%ntotal sales for %d days is EUR %.2f," +
                        "%nsales by day is EUR %.2f.%n",
                productName, dayCount, totalProfit, dayProfit);

        productName = "laptop";
        dayCount = 7;
        totalProfit = 10486.85;
        dayProfit = totalProfit / dayCount;
        System.out.printf("Product No 2: %s," +
                        "%ntotal sales for %d days is EUR %.2f," +
                        "%nsales by day is EUR %.2f.%n",
                productName, dayCount, totalProfit, dayProfit);


    }
}
