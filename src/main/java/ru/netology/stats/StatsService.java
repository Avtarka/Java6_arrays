package ru.netology.stats;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class StatsService {

    public int sumAllSales(int[] sales) { // сумма продаж
        int sumSale = 0; //

        for (int i = 0; i < sales.length; i++) {
            sumSale = sumSale + sales[i];
        }

        return sumSale;
    }
    public int averageSumSales(int[] sales) { //средняя сумма продаж
        int averageSales = 0; //

        for (int i = 0; i < sales.length; i++) {
            averageSales = averageSales + sales[i];
        }
        int averageSalesMonth = averageSales / sales.length;

        return averageSalesMonth; //
    }
    public int minSales(int[] sales) { //принимаем массив продаж
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }



    public int quantityMonthBelowSales(int[] sales) {
        int min = averageSumSales(sales);
        int belowAverageMonth = 0;

        for (int sale : sales) {
            if (sale < min) {
                belowAverageMonth = belowAverageMonth +1;
            }
        }
        return belowAverageMonth;
    }
    public int quantityMonthAboveSales(int[] sales) {
        int max = averageSumSales(sales);
        int aboveAverageMonth = 0;

        for (int sale : sales) {
            if (sale > max) {
                aboveAverageMonth = aboveAverageMonth +1;
            }
        }
        return aboveAverageMonth;
    }
}