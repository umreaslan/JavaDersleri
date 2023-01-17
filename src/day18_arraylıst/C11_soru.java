package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_soru {

    public static void main(String[] args) {

        // verılen  strıng bır lıstede ıstenmeyen harf ıceren elementlerı sılıp
        //kalan kısmını lıst olarak bıze donduren bır method olusturun

        List<String> ısımler= C10_soru.ısımLıstesıOlutur();

        System.out.println("ıstenmeyen harfın oldugu ısımler sılındı.\nKalan ısımler :"
                            + ıstenmeyenIsımlerıSıl(ısımler));
    }
    public  static List<String> ıstenmeyenIsımlerıSıl(List<String> ısımler){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ıceren ısımlerı sılmek ıcın bır harf gırınız");
        String ıstenmeyenHarf=scan.next().substring(0,1);

        List<String> yenıLıste=new ArrayList<>();

        for (int i = 0; i <ısımler.size() ; i++) {

            if (!ısımler.get(i).contains(ıstenmeyenHarf)){
                yenıLıste.add(ısımler.get(i));
            }

        }
        return yenıLıste;

    }
}
