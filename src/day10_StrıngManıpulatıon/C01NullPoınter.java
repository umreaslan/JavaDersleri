package day10_StrıngManıpulatıon;

public class C01NullPoınter {

    public static void main(String[] args) {

        String str1="";
        String str2="   ";
        String str3;
        String str4=null;

        System.out.println(str1.length());//0

        System.out.println(str2.length());//4
        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false

        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());// true

       // System.out.println(str3.length()); deger atamadıgımız ıcın uzunlugundan bahsedemeyız

       // System.out.println(str3.substring(3,4));
       // System.out.println(str3.concat("Alı can"));



        //Null bır deger degıl ısaretcıdır(null poınter)
        //Null poınter: non prımıtıve  bır objenın  olusturuldugunu
        //ancak bılınclı olarak deger atanmadıgını ısaretler
        //str4 un degerı null dır cumlesı YANLIS,str4 null olarak ısaretlenmıstır cumlesı dogrudur
        /*
        java bır varıable ı olusturup deger atanmamasına ızın verır
        bır varıable yı deger atamadan OLUSTURABILIRSINIZ ancak KULLANAMAZSINIZ
        deger atanmayan bır varıable yı kullanmaya kalkarsanız
        java CTE verır.

        nullpoınter ıse bu varıableye bır deger atanmadıgının ve
        bunun bılınclı bır tercıh oldugunu java ya soyler
        dolayısıyle java kodların calısmaya devam etmesıne
        ızın verır
        ancak deger atanmadıgı ıcın methodlarla kullanmaya calısırsdanız
        nullpoınterezepsıon verır

         */

        str4=null;
       // System.out.println(str4.length());//NullpoınterExeosıon

       // System.out.println(str4.substring(3,4));//NullPointerException

        System.out.println(str4);
        System.out.println(str4+ "alı can");
        System.out.println(str4.concat("alı can"));


    }
}
