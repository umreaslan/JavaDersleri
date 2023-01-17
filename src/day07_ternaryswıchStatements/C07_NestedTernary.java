package day07_ternaryswıchStatements;

public class C07_NestedTernary {

    public static void main(String[] args) {
        int sayı= 23;
        System.out.println(sayı>0
                            ?
                            sayı%2==0 ? "cıft sayı" :"tek sayı"
                             :
                             -100 >=sayı && sayı>=-999 ?  "3 basamaklı " :"3 basamaklı degıl");

    }
}
