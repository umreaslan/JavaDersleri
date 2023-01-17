package day06_IfElseStatement;

import java.util.Scanner;
public class C06_IfElseIf {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen cınsıyetınızı gırınız\nK :Kadın, E :Erkek");

         char cınsıyet= scan.next().charAt(0);


        System.out.println("lutfen yam sayı olarak yasınızı gırınız");
        int yas=scan.nextInt();

        if ((cınsıyet=='K'  ||  cınsıyet=='k')  && yas>=60 && yas<80){
            System.out.println("emeklı olabılır");
        } else if ((cınsıyet=='K' ||  cınsıyet=='k') &&  yas>=18 && yas<80) {
            System.out.println("Emeklı olmak ıcın " +(60-yas) + "yıl daha calısmalısın");

        } else if ((cınsıyet=='E' ||  cınsıyet=='e') && yas>=65 && yas<80){
            System.out.println("emeklı olabılır");


        } else if ((cınsıyet=='E' ||  cınsıyet=='e') &&  yas>=18 && yas<80) {
            System.out.println("Emeklı olmak ıcın " + (65-yas) + "yıl daha calısmalısın");

        }else {
            System.out.println("Gecersız bılgı");
        }
    }
}
