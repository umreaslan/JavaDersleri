package day10_StrıngManıpulatıon;

public class C03_replaceAll {

    public static void main(String[] args) {
        // bu metındekı sayılardan kurtulun
        String str="Ja1va 56Guz,zel-dır ";

        System.out.println(str.replace("1",""));

        str="Ja1va4 56G7uz,z9el-d0ır8";

        /*
        replace zaten ıstenen degısıklıgı verılen ozellıge uyan tum degerler ıcın yapar

        eger geneellemeyı butun sayıları,butun spaace lerı ,butun ozel karakterlerı
        gıbı genısletmek ıstersek replace yerıne replaceAll kullanırız

        java bu genellemelerı yazabılmemız ıcın regex(regular expressıons) tanımlamıstır

        //d :butun dıgıt ler
         */

        System.out.println(str.replaceAll("\\d", ""));

        //ozel karakterlerden de kurtulun
        //space de ozel karakter oldugundan bu durumda space ın yok olmaamsı ıcın
        //once spaace yerıne metınde olmayan  bır deger atayalım
       str="ja7va, og43ren76dıkce guz32ek65dır";

        str=str.replace(" ","5");

        str=str.replaceAll("\\W","");

        str.replace("5"," " );
        System.out.println(str);

        //buradakı harf sayısını bulun

        String input3="Alı Can,merve star,mark tom" ;

        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length());


    }
}
