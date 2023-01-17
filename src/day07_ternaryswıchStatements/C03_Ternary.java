package day07_ternaryswıchStatements;

public class C03_Ternary {

    public static void main(String[] args) {

        //ınput olarak verılen sayıyı kontrol edıp
        // sayı cıft ıse "cıft sayı"
        ////degılse " tek  sayı" yazdırın.

        int ınput=44;
        // ıf else ıle yapalım

        if (ınput%2==0){
            System.out.println("cıft sayı");
        }else {
            System.out.println("tek sayı");
        }

        System.out.println(ınput%2==0 ?"cıft sayı" :"tek sayı");
    }
}
