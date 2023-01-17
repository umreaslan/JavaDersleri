package day23_dataTıme_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTımeFormatter {


    public static void main(String[] args) {


        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        //sadece tarıhı 20/12/2022 olarak yazdıralım

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt.format(format1));

        //sadece tarıhı 12.20.2022 TUE sekılınde yazdırın

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("MM.dd.yy EEE");
        System.out.println(ldt.format(format2));

        //sadece zamanı 10.49 am olarak yazdırın

        DateTimeFormatter format3=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format3));
    }
}
