package day19_ArrayLıst_forEachLOOp;

public class C06_soru {
    public static void main(String[] args) {
         //Kullanıcıdan bır cumle ve bır harf alın
        //harf cumlede kullanılmıssa kac kere kullanıldıgını yazdırın
        //kullanılmadıysa "harf cumlede kullanılmamıs" yazdırın

      String cumle="Java ogrenmek cok guzel";
      String harf="e";
      String[] cumleArr=cumle.split("");

      int sayac=0;

        for (String eachHarf:cumleArr
             ) {

                 if (eachHarf.equals(harf)){
                     sayac++;


            }

        }
        if (sayac==0){
            System.out.println("harf cumlede kullanılmamaıs");
        }else {
            System.out.println(harf+ ",cumlede" +sayac+ "defa kullanılmıs");
        }

    }
}
