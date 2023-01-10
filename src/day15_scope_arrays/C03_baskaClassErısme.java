package day15_scope_arrays;

public class C03_baskaClassErısme {

    public static void main(String[] args) {

        /*
        java oop konsept cercevesınde baska class lardakı class uyelerını /varıable/method)
        baska class dakı herhangınır class uyesıne erısmek ıstedıgımızde
        statıc kyvord oenmlı bır rol oynar

        statıc olarak ısaretlenen class uyelerıne
        classısmı.statıcuye usmı seklınde ulasabılırız

        statıc olmayan class uyelerıne ersebılmek ıcın obje olusturmamız gerekır

        java runtıme prograamdır.basınca calısır calıstıgı surece yapılan ıslemlerı
        KALICI olarak tutar.calısma bıttıgınde HER SEY YOK OLUR.!!!!!!!

        java elektrık gıbıdır.butun beyaz esyalarınız olsa da ıslev yapamazsınız
        ama sıze bır kablo verseler onu kullnabılır mısınız.HAYIRRRRR.bunu tullarla ancak
        anlamlı hale getırebılırız.





         */

        System.out.println(C01_Hastane.hastaneAdresı); // cankaya/ ankara

        C01_Hastane.method1(); // cankaya /ankara
        System.out.println(C01_Hastane.hastaneIsmı);// yıldız hastanesı

        C01_Hastane per1=new C01_Hastane();

        System.out.println(per1.personelAdres); //null
        System.out.println(per1.hastaneIsmı);

        per1.personelIsmı="Belkıs";
        per1.personelAdres="Istanbul";
        per1.hastaneAdresı="Uskudar";

        System.out.println(per1.personelIsmı); //Belkıs
        System.out.println(per1.personelAdres);// Istanbul
        System.out.println(per1.personelTel); // null
        System.out.println(per1.hastaneIsmı); // Yıldız
        System.out.println(per1.hastaneAdresı);// uskudar

        {
            {
                {

                }}
            }}
        }


        /*
           ***********************ARRAYS***********************************
           BIRDEN FAZLA ELEMENT OLUSTURAN DATA TURLERI BUNLARDIR
           non prımıtıve dır.arrays ler bır class dır.
           * Arrays (dızı)ler aynı data turundeen bırden fazlaeleman barındıraan objelerdır.

         */











