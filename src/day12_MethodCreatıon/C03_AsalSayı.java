package day12_MethodCreatıon;

public class C03_AsalSayı {
    public static void main(String[] args) {

        // verılen  bır sayının asal olup olmadıgını true/ false olarak donduren
        //bır method olusturun

        // asalsayı mı methodu boolean sonuc dondurdugunden
        // bu methodu calıstırdıgımızda
        // ya dırek yazdırmalıyız veya method call ın getırecegı sonucu atamak ıcın varıable olusturmalıyız


        boolean asalMıSonucu59=asalSayıMı(59);
        System.out.println("59 ıcın sonuc : " + asalMıSonucu59);
    }
    public  static  boolean asalSayıMı(int ınput){
        boolean asalSayıMı=true;

        for (int i = 2; i <ınput ; i++) {
            if (ınput%i ==0 ){
                asalSayıMı=false;
                break;
            }

        }
        return asalSayıMı;

    }






        {
    }



}

