package day30_Interface_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N03_Iterator {

    public static void main(String[] args) {

        //bır lıstedekı ıstene sayı aralıgındaa olmayan elementlerı sılen bır program olusturalım
        //2.lıste olusturmadan gecerlı lıste uzerınden ıslem yapınız



        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(2);
        sayılar.add(13);
        sayılar.add(56);
        sayılar.add(23);
        sayılar.add(45);
        sayılar.add(14);
        sayılar.add(40);

        ListIterator lit=sayılar.listIterator();
        while (lit.hasNext()){
            Integer sayı=(Integer)lit.next();
            if (sayı<20  || sayı>40){
                lit.remove();
            }
        }
        System.out.println(sayılar);
    }
}
