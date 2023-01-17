package day23_dataTıme_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04perıod {
    public static void main(String[] args) {

        LocalDate dogumtarıhı=LocalDate.of(1995,8,12);
        LocalDate bugun=LocalDate.now();
        Period yas=Period.between(dogumtarıhı,bugun);
        System.out.println(yas);
        System.out.println(yas.getYears());


        LocalDate baslangıc=LocalDate.of(2001,9,4);
        LocalDate bıtıs=LocalDate.of(2005,5,20);

        Period  sure=Period.between(baslangıc,bıtıs);
        System.out.println(sure);
    }
}
