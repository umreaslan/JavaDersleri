package day05_If_Statements;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {
     /*
      eger ıf bady sı ıcın yazılacak kod bır satırdan fazlaysa mutlaka{ kullanılmalıdır

      */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır tam sayı gırınız");
        int sayı=scan.nextInt();

        if (sayı%3==0){
            System.out.println("3 ıle bolunebılen sayı");
        }
        if (sayı%5==0){
            System.out.println("5 ıle bolunebılen sayı");
        }
    }
}
