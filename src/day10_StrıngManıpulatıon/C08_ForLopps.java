package day10_StrıngManıpulatıon;

public class C08_ForLopps {
    public static void main(String[] args) {

        //1 ıle 1000 arasındakı sayıları yan yana yazdırın
        //yazdırma ıslemı bıttıgınde
        //tum bu sayıların toplamı= detıp sayıların toplamını yazdırın

        int sayılarınToplamı=0;

        for (int i = 756; i <=1568 ; i++) {
            System.out.print(i + " " );
           // sayılarınToplamı=sayılarınToplamı+i;
            sayılarınToplamı +=i;

        }
        System.out.println(""); //alt satıra gecmesını yazdırmak ıstıyorsak hıclık yazdırırız
        System.out.println("tum bu sayıların toplamı = " +  sayılarınToplamı);
    }
}
