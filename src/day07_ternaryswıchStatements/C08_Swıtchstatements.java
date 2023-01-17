package day07_ternaryswıchStatements;

public class C08_Swıtchstatements {
    public static void main(String[] args) {

        //Kullanıcıdan 2 sayı alın
        //ve kullanıcıya ıstedıgı ıslemı sorun
        //+,-,*,/ ısaretlerınden hangısını gırerse
        //2 sayı ıcın o ıslemı yapın
        // bu ısaretlerden bırını gırmezse
        //"yanlıs ıslem tercıhı yazdırın


        int sayı1=10;
        int sayı2=20;
        char ıslem='/';


        // ıf else ıle yapalım

        if (ıslem=='+'){
            System.out.println("sayıların toplamı :" + (sayı1+sayı2));

        } else if (ıslem=='-'){
            System.out.println("sayıların farkı :" +(sayı1-sayı2));

        } else if (ıslem=='*') {
            System.out.println("sayıların carpımı :" +(sayı1*sayı2));


        } else if (ıslem=='/') {
            System.out.println("sayıların bolumu :" +(sayı2/sayı1));

        }else {
            System.out.println("yanlıs ıslem tercıhı");
        }

        //swıtch satatements ıle yapalım
        System.out.println("====================");

        switch (ıslem){
            case '+':
                System.out.println("sayıların toplamı :" + (sayı1+sayı2));
                break;
            case '-':
                System.out.println("sayıların farkı :" + (sayı1-sayı2));
                break;
            case '*':
                System.out.println("sayıların carpımı :" + (sayı1*sayı2));
                break;
            case '/':
                System.out.println("sayıların bolumu :" + (sayı2/sayı1));
                break;
            default:
                System.out.println("yanlıs ıslem tercıhı");

        }
    }
}
