package day23_dataTıme_varargs;

public class C08_Varargs {

    public static void main(String[] args) {

        /*
        argument olarak tamsayılar alıp
        ılk arg. harıc gerıye kalanları toplayan
        bulunan toplamı ılk arg.ıle carpıp
        sonucu yazdıran bır method olusturun
        (arg.sayısı degısken olabılır)
         */


        islemYap(3,4,5,8,1,2); // 60
        islemYap(5,1); // 5
        islemYap(4); // 0
        islemYap(3,4,5,6); // 45
    }
    private static void islemYap(int ilkSayi, int... geriyeKalanlar) {
        int geriyeKalanlarToplami=0;
        for (int each: geriyeKalanlar
        ) {
            geriyeKalanlarToplami += each;
        }
        System.out.println(geriyeKalanlarToplami*ilkSayi);
    }


    }




