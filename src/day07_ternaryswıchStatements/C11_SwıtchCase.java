package day07_ternaryswıchStatements;

public class C11_SwıtchCase {
    public static void main(String[] args) {


        //Kullanıcıdan ISTQB kısaltmasından hangı harfın
        //anlamını ogrenmek ıstedıgını alın
        //ve gırılen harfın kRSILIGINI YAZDIRIN
        //I:INTERNATIONEL S:software T:testıng Q:qualıfıcatıons B:Board

        char harf='t';
        switch (harf){

            case 'I':
            case 'ı':
                System.out.println("Internatıon");
                break;
            case 'S':
            case 's':
                System.out.println("S");
            case 'T':
            case 't':
                System.out.println("testıng");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualificstions");
                break;

            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Yanlıs harf secımı");
        }
    }
}
