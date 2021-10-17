package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldCalculateMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;

        long actual = service.findAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthUnderAvgSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;

        long actual = service.findMonthUnderAvgSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthAboveAvgSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;

        long actual = service.findMonthAboveAvgSale(sales);

        assertEquals(expected, actual);
    }


}