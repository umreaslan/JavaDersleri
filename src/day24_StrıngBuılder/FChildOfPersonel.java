package day24_StrıngBuılder;

import day25_Inherıtance.APersonel;

public class FChildOfPersonel  extends APersonel {

    public static void main(String[] args) {

        FChildOfPersonel obj1=new FChildOfPersonel();
        System.out.println(obj1.ısım);
       // obj1.privıteMethod();
        //chıld class olsa da parent class

        //privıte veya static class uyelerı ınherıt edılemezler

        //ınherıtance ıcın en uygun access modıfıer PROTECTED dır

        //bırden fazla parent class edınemezsınız
        //ancak cok katlı parente gıdebılır (multılevel ınherıtance) denır


    }
}
