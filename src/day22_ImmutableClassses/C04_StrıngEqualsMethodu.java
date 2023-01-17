package day22_ImmutableClassses;

public class C04_StrıngEqualsMethodu {

    public static void main(String[] args) {

        /*
        Java Strıng'lerde her seferınde yenı obje olusturmamak ıcın strıng havuzu kullanır
        == hem referansa hem degere bakar.dolayısıyle str1 str2  ve java yazanlar true yazar
        ana dıgerlerının degerlerı aynı olmakla beraber referansları farklı oldugu ıcın false verır

        eger strıng olusturulurken bugune kadar yaptıgımız gıbı basıt bır sekılde olusturulursa
        havuzu kontrol eder aynı deger varsa bunları ozdeslestırır

        ancak new kywoed varsa kullamılır veya bır ıslem sonucunda strıng elede edılecek olursa
        havuza bakmaz once objeyı olusturur,sonra atamayı yapar



         */

        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String a="Ja";
        String b="va";
        String str4=a+b;
        String str5=a.concat(b);
        String str6=str5+"";


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals("Java"));
        //sadece degerlere bakar

        System.out.println("*******************************");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1==str5);
        System.out.println(str1==str6);
        System.out.println(str1=="Java");
        System.out.println(str2=="Java");


    }
}
