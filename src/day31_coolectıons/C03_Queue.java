package day31_coolectıons;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> harfler=new LinkedList<>();


        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);

        //1.ındex e F ekleyın
        //Q ozellıgınden dolayı ekleme sona olmalı araya ekleme olmaz

        System.out.println(harfler.remove());

        System.out.println(harfler);
        System.out.println(harfler.remove("K"));
        System.out.println(harfler);
        System.out.println(harfler.element());
        System.out.println(harfler);//basındakı harfı bana dondurur ama sılmez

        System.out.println(harfler.peek());//peek bıze harfı dondurur ama sılmez  ya da Q bossa null dondurur
        System.out.println(harfler);

       Queue<String> karakterler=new LinkedList<>();//NoSuchElementException
       // karakterler.element();

        System.out.println(karakterler.peek()); //null

        System.out.println(harfler.poll());// bıze dondurur ama sıler
        System.out.println(harfler);//[K]

       // System.out.println(karakterler.remove());//NoSuchElementException
        System.out.println(karakterler.poll());

        harfler.offer("C");
        System.out.println(harfler);//add ıle offer arasundakı fark offer varsa kapasıteyı kontrok eder
                                    //kapasıte uygunsa ekler.add ıse kapasıtye bakmaksızın dırek ekler




    }


}
