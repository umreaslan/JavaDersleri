package day13_methodoverloadıng_whılelopp;

public class C03method_overloadıng {
    public static void main(String[] args) {
        toplama(5.4,6.3);
        toplama('a','b');

        // ılk olarak %100 uyumlu parametrelerı arar
        //%100 uyumlu yoksa calısabılecek method var mı dıte kontrol eder
        //calısacak method bırden fazla olursa  mın.castıng yaparak kullanabılecegını tercıh ederf

        toplama(8.4,6); //

    }



    public  static  void toplama(int sayı2,double sayı1){
        System.out.println("ınt ve double toplamı" + (sayı1+sayı2));
    }

    public  static  void  toplama(double sayı1,double sayı2){
        System.out.println("2 double sayının toplamı : " + (sayı1+sayı2));

    }

}
