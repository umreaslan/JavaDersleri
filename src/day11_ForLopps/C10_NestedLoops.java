package day11_ForLopps;

public class C10_NestedLoops {
    public static void main(String[] args) {
     /*
     1           1.satır  1 den 1 e kadar yazdır
     1   2        2.satır  1 den 2 ye kadar yazdır
     1    2 3     3.satır  1 den 3 e kadar yazdır
     1 2 3 4       4.satır 1 den 4 e kadar yazdır


      */
        int ınput=4;

        for (int i = 1; i <=ınput ; i++) {// 4 satır oldugu ıcın outer loop 1-4 arası olacak

            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");

            }

            System.out.println("");

        }
    }
}
