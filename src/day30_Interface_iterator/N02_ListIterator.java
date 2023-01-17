package day30_Interface_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(5);
        sayılar.add(23);
        sayılar.add(2);
        sayılar.add(9);
        sayılar.add(11);
        System.out.println(sayılar);

        ListIterator lit=sayılar.listIterator();
        while (lit.hasNext()){
            Integer sayı=(Integer)lit.next();
            lit.set(sayı+3);
        }
        System.out.println(sayılar);

        //lısteyıdekı tum elementlerı iterator kullanarak sondan basa dogru yazdırın

        //bır usttekı loop ıle sona gıttıgımız ıcın ıteraator suan en sonda
        //yanı olmasını ıstedıgımız yerde

        while (lit.hasPrevious()){
            System.out.print(lit.previous() + " ");

        }

    }


}
