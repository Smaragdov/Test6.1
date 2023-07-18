package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalsale = 0;
        for (long sale : sales) {
            totalsale += sale;
        }
        return totalsale;
    }

    public long average(long[] sales) {
        long totalsale = 0;
        for (long sale : sales) {
            totalsale += sale;
        }
        long averageSale = totalsale / 12;
        return averageSale;

    }

    public int monthMaxSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;

    }
    public int monthMinSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;

    }

    public int monthsBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }

        }
        return counter;
    }
}
