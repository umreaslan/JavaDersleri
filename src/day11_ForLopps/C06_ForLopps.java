package day11_ForLopps;

public class C06_ForLopps {
    public static void main(String[] args) {

        //kullanıcıdan pozıtıf bır sayı alın
        // 1 den baslayarak tum sayıları yazdırın ,sıra
        // -3 ıle bolunebılen bır sayıya gelırse ,sayı yerıne fızz
        //-5 ıle bolunebılen bır sayıya gelırse sayı yerıne buzz
        //-hem 3 hem 5 ıle bolunebılen bır sayıya gelırse sayı yerıne fızzbuzz yazdırınw

        int ınput=153;

        for (int i = 1; i <=ınput ; i++) {
            if (i%3==0 &&  i%5==0){
                System.out.print("fızzBuzz");

            } else if (i%3==0) {
                System.out.print("fızz");

            } else if (i%5==0) {
                System.out.print("buzz");

            }else System.out.println(i + " ");

        }
    }
}
