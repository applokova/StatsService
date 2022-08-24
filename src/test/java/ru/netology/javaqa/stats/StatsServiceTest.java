package ru.netology.javaqa.stats;

import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void calculationOfSalesAmount(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.salesAmount(sales));
    }

    @Test
    public void calculationOfTheAverageAmountOfSales(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.averageSalesAmount(sales));
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.maxSales(sales));
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.minSales(sales));
    }

    @Test
    public void monthsWithLessThanAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.belowAverageSales(sales));
    }

    @Test
    public void monthsWithAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.aboveAverageSales(sales));
    }
}

