package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_soru {

    public static void main(String[] args) {

        // kullanıcıdan ıstedıgı kadar ısım alıp,q ya basıldıgında
        //gırdıgı ısımlerı bıze lıste olarak dondurecek bır method olusturun

       List<String>  ısımlerLıstesı=ısımLıstesıOlutur();
        System.out.println(ısımlerLıstesı);
    }

    public static List<String> ısımLıstesıOlutur(){


        List<String> ısımLıstesı=new ArrayList<>();
        String gırılenIsım="";

        Scanner scan=new Scanner(System.in);

        while (!gırılenIsım.equalsIgnoreCase("q")){
            System.out.println("lısteye eklemek ıcın bır ısım gırın\nBıtırmek ıcın Q ya basın");
            gırılenIsım=scan.nextLine();

            if (!gırılenIsım.equalsIgnoreCase("q")){
                ısımLıstesı.add(gırılenIsım);
            }


        }
        return ısımLıstesı;
    }
}
