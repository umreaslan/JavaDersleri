package day31_coolectıons;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LınkedList {
    public static void main(String[] args) {


        /*

        Collectıons objelerı bırarada tutan yapılardır
        gercek hayattakı ıhtıyaclara gore java farklı collectıons yapıları olusturmustur
        bır uygulamada hangı colectıons  u kullanacagımıza ıstedıgımız ozelıklere gore karar verır

        Collectıons temel de 3 ana gruba ve 3 ınterface ıle kuralları belırlemıstır
       lınk yapısından dolayı  ekleme ve sılme de cok hızlıdır fakat BULMADA kotudur
        -Lıst
        -Queve
        -Set

        Ancak ınterfacelerden obje olusturulanmayacagı ıcın
        chıld  classların  cons. kullanılır
        burada ozellıklerı belırleyen cons. degıl DATA TURU OLARAK secılen coolectıons dur

        ornegın Lınked lıst olustururken
         */

        LinkedList<String> ll1=new LinkedList<>();
        //lıst queue ve Deque ozdellıllerının  hepsını tasır
        List<String> ll2=new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4 =new LinkedList<>();
    }
}
