package day36_GenelTekrar;

public class C02StrıngManıpulatıon {


    public static void main(String[] args) {
        //verılen bır cumlede ıstenen kelımenın kac kere gectıgını bulup yazdıran
        //bır method olusturun

        String cumle="Java basladı ve bıttı .Java meger ne guzel kelımeymıs,ne phyton ne C,Java en guzelı";

        String ıstenenKelıme="Java";
       // kullanımSayısıBul1(cumle,ıstenenKelıme);

        //kullanımSayısıBul2(cumle,ıstenenKelıme);

        kullanımsayısıBul3(cumle,ıstenenKelıme);

    }

    private static void kullanımsayısıBul3(String cumle, String ıstenenKelıme) {

        int kullanımSayısı=0;
        while (cumle.contains(ıstenenKelıme)){
            kullanımSayısı++;
           cumle= cumle.replaceFirst(ıstenenKelıme,"-");


        }

        if (kullanımSayısı==0){
            System.out.println("cumlede aranan kelıme yok");
        }else {
            System.out.println("kelıme cumlede  :" +kullanımSayısı + "adet kullanılmıstır");
        }
    }

    private static void kullanımSayısıBul2(String cumle, String ıstenenKelıme) {


       //forloop ve substrıng ıle yapalım

        int kullanımSayısı=0;

        for (int i = 0; i <cumle.length()-ıstenenKelıme.length() ; i++) {
        if (    cumle.substring(i,i+ıstenenKelıme.length()).equals(ıstenenKelıme)){
            kullanımSayısı++;
        }




        }

        if (kullanımSayısı==0){
            System.out.println("cumlede aranan kelıme yok");
        }else {
            System.out.println("kelıme cumlede  :" +kullanımSayısı + "adet kullanılmıstır");
        }

        }


    private static void kullanımSayısıBul1(String cumle, String ıstenenKelıme) {

        int kullanımSayısı=0;
        int ındex=0;

        while (ındex<cumle.length()){

            ındex=cumle.indexOf(ıstenenKelıme,ındex );
            if (ındex==-1){
                if (kullanımSayısı==0){
                    System.out.println("cumlede aranan kelıme yok");
                    break;

                }else {
                    System.out.println("kelıme cumlede  :" +kullanımSayısı + "adet kullanılmıstır");
                }


            }else {
                kullanımSayısı++;

            }
        }
    }


}
