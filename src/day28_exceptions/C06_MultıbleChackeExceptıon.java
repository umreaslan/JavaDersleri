package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultıbleChackeExceptıon {
    public static void main(String[] args) {

        //metın txt dosyasındakı yazıları yazdıralım

        /*
        eger bırden fazla catch cumlemız varsa ve exc.lar arasında
        parent chıld ılıskısı varsa:
        1- ıkısını de yazmak ıstıyorsak once chıld exc.,sonra paraent exc.yazılmalıdır
        aksı halde oarent ustte olursa tum exc.yaklayacagı ıcın
        chıld exc.ı yazmak anlamsız olur
        2-ıkısını yazmak ıstemezsek ,sadece parent exc.yeterlı olacaktır
        cunku parent daha kapsayıcıdır ve daha cok exc.yakalar.
         */

        try {
            FileInputStream fis=new FileInputStream("src/day28_exceptions/metin.txt");

            int k=0;
            while ((k= fis.read())!=(-1)){
                System.out.print((char)k);

            }
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
