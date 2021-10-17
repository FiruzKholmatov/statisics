package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public long findAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public long findMonthUnderAvgSale(long[] sales) {
        int num = 0;
        for (long sale : sales) {
            if (sale <= findAverage(sales)) {
                num = num + 1;
            }
        }
        return num;
    }

    public long findMonthAboveAvgSale(long[] sales) {
        int num = 0;
        for (long sale : sales) {
            if (sale >= findAverage(sales)) {
                num = num + 1;
            }
        }
        return num;
    }


}
