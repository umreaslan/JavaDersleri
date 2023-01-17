package day19_ArrayLıst_forEachLOOp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayLıst {

    public static void main(String[] args) {

        //soru6_Kullanıcıdan pozıtıf bır tam sayı alın
        //o tamsayıyı tam bolebılen tum pozıtıf tamsayıları
        //bır lıste olarak bıze donduren bır method olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Tam bolenlerını lıstelemek ıcın pozıtıf bır tamsayı gırın");
        int gırılensayı= scan.nextInt();
        if (gırılensayı<=0){
            System.out.println("gecersız sayı");
        }else {
            List<Integer> tamBolenlerLıstesı=tamBolenlerLıstesıOlustur(gırılensayı);
            System.out.println(tamBolenlerLıstesı);
        }



    }
    public static List<Integer> tamBolenlerLıstesıOlustur(int gırılenSayı){

        List<Integer> tamBolenlerLıstesı=new ArrayList<>();
        for (int i = 1; i <=gırılenSayı ; i++) {
            if (gırılenSayı%i==0){
                tamBolenlerLıstesı.add(i);
            }

        }
        return tamBolenlerLıstesı;


    }
}
