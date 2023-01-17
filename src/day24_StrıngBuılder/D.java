package day24_StrıngBuılder;

public class D {

    private  String ısım="Mustafa";
    String ısımDefault="Furkan";
    static  String ısımDefaultStatıc="Sevılay";

    public static void main(String[] args) {

       // System.out.println(ısım); //statıc olmdıgı ıcın statıc maın method ıcınde dırek kullanamayız

        D obj1=new D();

        System.out.println(obj1.ısım);
        statıcMethod();
        System.out.println(obj1.ısım);
    }

    private   void  statıcOlmayanMethod(){
        ısım="Huseyın";
        System.out.println(ısım);
    }
    void StatıcOlmayanMethod(){
        System.out.println("defaul access modıfıer");
    }

    static  void  defaultStatıcMethod(){
        System.out.println("default access modıfıer");

    }
    public  static  void  statıcMethod(){

        D obj1=new D();
        obj1.ısım="Zafer";
        System.out.println(obj1.ısım);
    }
}
