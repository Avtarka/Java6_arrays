package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expeсted = 180;
        int actual = service.sumAllSales(sales);

        Assertions.assertEquals(expeсted, actual);
    }
    @Test
    public void averageSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expeсted = 15;
        int actual = service.averageSumSales(sales);

        Assertions.assertEquals(expeсted, actual);
    }
    @Test
    public void shouldNumberDayMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expeсtedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expeсtedMonth, actualMonth);

    }

    @Test
    public void shouldNumberDayMAxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expeсtedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expeсtedMonth, actualMonth);

    }

    @Test
    public void minMonthBelowSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expeсted = 5;
        int actual = service.quantityMonthBelowSales(sales);

        Assertions.assertEquals(expeсted, actual);
    }
    @Test
    public void monthBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expeсted = 5;
        int actual = service.quantityMonthBelowSales(sales);

        Assertions.assertEquals(expeсted, actual);
    }
    @Test
    public void monthAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expeсted = 7;
        int actual = service.quantityMonthAboveSales(sales);

        Assertions.assertEquals(expeсted, actual);
    }

}
