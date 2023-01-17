package day22_ImmutableClassses;

import java.time.LocalDate;

public class C05_LocalDate {

    public static void main(String[] args) {

        LocalDate tarıh=LocalDate.now();
        System.out.println(tarıh);

        System.out.println(tarıh.getDayOfWeek());
        System.out.println(tarıh.getMonthValue());
        System.out.println(tarıh.getMonth());
        System.out.println(tarıh.getDayOfYear());
        System.out.println(tarıh.getDayOfMonth());


        System.out.println(tarıh.withYear(2015));
        System.out.println(tarıh.withDayOfMonth(15));
        System.out.println(tarıh.withDayOfMonth(15).withYear(2015));


        System.out.println(tarıh.isLeapYear());

        System.out.println(tarıh.minusWeeks(5));
        System.out.println(tarıh.minusYears(3).minusMonths(5).minusDays(5));
        System.out.println(tarıh.plusWeeks(19));
        System.out.println(tarıh.plusYears(10).minusMonths(3).plusDays(10));

        LocalDate tarıh1=LocalDate.of(1975,10,13);
        LocalDate tarıh2=LocalDate.of(1975,10,20);
        System.out.println(tarıh1.isBefore(tarıh2) ? "tarıh1 daha eskı":" tarıh2 daha eskı");

        System.out.println(tarıh1.isLeapYear());
        System.out.println(tarıh.hashCode());
        System.out.println(tarıh1.hashCode());
        System.out.println(tarıh2.minusDays(7).hashCode());
    }
}
