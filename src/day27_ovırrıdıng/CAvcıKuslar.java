package day27_ovırrıdıng;

public class CAvcıKuslar  extends BKuslar{

    public void hareket(){
        System.out.println("ucarlar");
    }
    public  void beslenme(){
        System.out.println("et yerler");
    }
    protected  void  pence(){
        System.out.println("pencelıdırler");
    }
    protected  void  gaga(){
        System.out.println("sıvrı gagalı");
    }

    public static void main(String[] args) {

        CAvcıKuslar krt1=new CAvcıKuslar();
        krt1.hareket(); // c den kullanır
        krt1.beslenme();//c
        krt1.pence();//c
        krt1.gaga();//c
        krt1.kanat();//b
        krt1.solunum();//b
        krt1.cogalma();// b
        krt1.omur(); // a

        // eger constructer ıle data turu aynı ıse
        //0zellıgın varıable veya method olmasına bakılmaksızın
        // o clasa gıdılır,o class veya parent class lardan
        //buluna ILK DEGER kullanılır

        BKuslar krt2=new CAvcıKuslar();

        krt2.hareket(); // c den kullanır
        krt2.beslenme();//c
       // krt2.pence();//c BKuslar veya oarent class da yok CTE verır
        krt2.gaga();//c
        krt2.kanat();//b
        krt2.solunum();//b
        krt2.cogalma();// b
        krt2.omur(); // a

        AHayvanlar krt3=new CAvcıKuslar();

        krt3.hareket(); // c den kullanır
        krt3.beslenme();//c
      // krt3.pence();// Ahayvanlarda  yok ,CTE
       // krt3.gaga();// CTE
       // krt3.kanat();// CTE
        krt3.solunum();//b
        krt3.cogalma();// b
        krt3.omur(); // a

        //methOdlar DINAMIKTIR
        //VARIABLELELR  STATICTIR


    }
}
