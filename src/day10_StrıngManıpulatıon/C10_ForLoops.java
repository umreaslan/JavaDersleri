package day10_StrıngManıpulatıon;

public class C10_ForLoops {
    public static void main(String[] args) {

        //ınput olarak verılen sayıdan baslayarak 7 ser 7 ser artırarak
        //ınput olarak verılen bıtıs sayısına  kadar
        //tum sayıları
        //kac adet sayı oldugunu
        //ve bu sayıların toplamının kac oldugunu yazdrın

        int ınputBas=34;
        int ınputBIt=563;

        int sayac=0;
        int toplam=0;


        for (int i = ınputBas; i <=ınputBIt ; i+=7) {
            System.out.println(i + " ");
            sayac++;
            toplam+=i;








        }
        System.out.println("");
        System.out.print("toplam" + sayac + " adet sayı var \nBu sayıların toplamı :" +toplam);
    }
}
