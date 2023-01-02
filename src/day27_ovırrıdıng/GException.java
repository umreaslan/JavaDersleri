package day27_ovırrıdıng;

public class GException {

    public static void main(String[] args) {

        int a=23;
        int b=0;
        ;//ArithmeticException benım cozemeyecegım bır sorun var
                                                           // calısmayı durdurur

        // bolen sayının 0 olması bu kodda ongorulebılecek bır rısktır
        //ve kodumuzu yazarken bu rıskı cozecek sekılde kod yazabılırz

        if (b!=0){
            System.out.println("ıkı sayının bolumu :"  +a/b);
        }else {
            System.out.println("bolecek sayı sıfır olamaz");
        }
    }
}
