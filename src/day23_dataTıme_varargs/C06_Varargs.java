package day23_dataTıme_varargs;

public class C06_Varargs {

    public static void main(String[] args) {
// oyle bır method olusturalımkı kac tane yazarsak yazalım .argumentlerın toplamını versın

        topla(5,6);
        topla(4,3,5,6);
        topla(2,3,4,5,6,7,8);
        /*
        varargs array alt yapısını kullanır
        temek hedef argument sayısı degısse bıle
        aynu data turundekı argumentlerı alabılecek br parametre olusturmaktır
         */


    }

    private static void topla(int...sayılar) {
        int  toplam1=0;

        for (int i = 0; i <sayılar.length ; i++) {
            toplam1 +=sayılar[i];



        }
        System.out.print(toplam1);


        int toplam2=0;

        for (int each:sayılar
             ) {
            toplam2 +=each;

        }
        System.out.print(toplam2);
    }
}
