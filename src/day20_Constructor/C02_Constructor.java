package day20_Constructor;

public class C02_Constructor {

    public static void main(String[] args) {

        /*
        Bır obje olusturulurken ıstedıgımız ozellıklerı dırek atayabılırsek
        sonradan tekrar bır atama ıslemı yapmama gerek kalmaz

        Bu durumda atamayı tek tek bızım yapmamız yerıne cons.ın atama yapmasını ıstemelıyız
        Atama yapmak ıcın cons.a parametre gondermelıyız
        bır cons.olusturuyorsak  parametre

         //atama yapmak ıcın con.a parametre gondermelıyız
         */

        karesınıYazdır(5);
        karesınıYazdır(10);


        Car car1=new Car("BMW","5.20",2020,15000,"Beyaz");
        System.out.println(car1);


        Car car2=new Car("Tofas","sahın",2010);
        System.out.println(car2);


        Car car3=new Car("toyota","corolla",2016,"grı");
        System.out.println(car3);
    }





    public static void karesınıYazdır(int sayı){
        System.out.println(sayı*sayı);

    }
}
