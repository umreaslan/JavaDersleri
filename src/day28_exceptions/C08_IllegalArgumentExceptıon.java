package day28_exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptıon {
    public static void main(String[] args) {

        //kullanıcıdan yasını gırmesını ısteyın

        Scanner scan= null;
        try {
            scan = new Scanner(System.in);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
        System.out.println("lutfen yasınızı gırınız");
        int yas= scan.nextInt();

        if (yas<0){
            throw new IllegalArgumentException("hata");

        }else {
            System.out.println("yasınız kaydedıldı");



        }

    }
}
