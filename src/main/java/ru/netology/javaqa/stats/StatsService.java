package ru.netology.javaqa.stats;

public class StatsService {
    public int salesAmount(int [] sales) {
        int month = 0;
        for(int i = 0; i < sales.length; i++){
            month += sales[i];
        }
        return month;
    }

    public int averageSalesAmount(int [] sales) {
        int average = salesAmount(sales) / 12;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int month = 0;
        int average =  averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale < average) {
                month = month + 1;
            }
        }
        return month;
    }

    public int aboveAverageSales(int[] sales) {
        int month = 0;
        int average = averageSalesAmount(sales);
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                month = month +1;
            }
        }
        return month;
    }

}

