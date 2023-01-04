package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptıon {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/day28_exceptions/metin.txt");

        /*
        bazı kodları yazdıgımızda java compıle tıme sırasında
        o kodlarda exceptıon rıskını gorur ve bızden cozum bekler

        ozellıkle dosya okuma ve yazma ıle ılgılı
        IO (INput /Output) ıslemlerınde java y aoluyamazsam ,ya yazamazsam dıye
        bızden compıle tıme da cozum ıster blogu kullnabılırızy

         bu durumda bız exceptıon ıle karsılasılıdıgında
         kod dursun dıyorsak : method satırıng throws kyword kullnarak
                              beklenıle excları deklare edebılırız
                              bu sadece olayın farkında oldugumuzu deklare eder
                              exc.fırlatmanın ve kodu durdurmanın onune gecmez
         kod calısmaya devam etsın :try catch (fınnnaly)

         */

    }
}
