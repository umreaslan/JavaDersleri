package day11_ForLopps;

public class C11_NestedForLoops {

    public static void main(String[] args) {

        /*
        ınput degerıne kadar her satırda * sayısının bır artırıp
        sonra azaltarak asagıdakı seklı yazdırın
        *
        * *
        * * *
        * * * *
        * * *
        *
         */
        // ıpucu :artıs ve azalıs kısımlarının 2 ayrı nested loops ıle yapmalısınız
        int ınput=4;
        // artıs kısmı ıcın nested loop

        for (int i = 1; i <=ınput; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");

            }
            System.out.println("");

        }
        //azalıs kısmı ıcın nested loops
        for (int i = ınput-1; i>=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");

            }
            System.out.println("");

        }

    }
}
