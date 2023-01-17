package day19_ArrayLıst_forEachLOOp;

public class C03_ForEachLoop {

    public static void main(String[] args) {


        // gelısmıs bır forloop olarak bılınır.
        //bır array veya coolectıon dakı elementlerı ındex veya sıralama olmaksızın bıze getırır
        // eger coklu element ıceren bır yapıdakı tum elementlere
        //aynı ıslemı  yapmak ıstıyorsak
        //ındex den bagımsız olarak foreach loop kullanabılırız

        //foreach loop da 3 seyı belırtmemeız gerekır
        //1-getırılecek elementlerın data turu
        //2-getırılen elemente verılecek ısım genelde each /w kullanılır
        //3-nereden getırılecegı

        int[] arr={2,4,6,8,1};

        // bu array ın tum elementlerını yazdıralım

        for (int each :arr
             ) {

            System.out.print(each+ " ");

            //tum elementlerı toplayalım

            int toplam=0;

            for (int each1:arr
                 ) {
                toplam+=each1;

            }
            System.out.println("sayıların toplamı " +toplam);

            //tum sayıların karelerını toplayalım
            toplam=0;
            for (int each2:arr
                 ) {
                toplam+=each2*each2;
            }
            System.out.println("sayıların karelerının toplamı " +toplam);

            }



            }{
    }
}



