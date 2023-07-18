package ru.netology.stats;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void testSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.sum(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.average(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaxSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthMaxSale(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMinSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthMinSale(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthsBellowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsBellowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsAboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
