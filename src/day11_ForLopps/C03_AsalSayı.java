package day11_ForLopps;

public class C03_AsalSayı {
    public static void main(String[] args) {

        // ınput olarak verılen bır tam sayının asal sayı olup olmadıgını yazdrın

        int ınput=19;
        String sonuc="sayı asal";

        for (int i = 2; i <ınput ; i++) {

            if (ınput%i==0){
                System.out.println(i);// for un ıcıne yazsak devam eder  gıder durmaz
                System.out.println("sayı asal degıl");
                break;
                //  Java bır loops un ıcerısınde  "break" gorurse o loops u bıtırır
            }
            System.out.println(sonuc);
            break;


        }
    }
}
