package day09_strıngManıpulatıon;

public class C05_indexOf {
    public static void main(String[] args) {

         String str="Java ıle kodlama cok kolay";

         //str "cok" ıcerıyor mu?
        System.out.println(str.contains("cok"));

        //kullanıcıdan aldıgımız cumle "cok" ıle baslayan ılk kelımeyı yazdırın

        System.out.println(str.indexOf('a'));// 1
        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf("cok"));
        System.out.println(str.indexOf("a",5));//ındex herzaman 0 dan baslar

        //2. O NUN INDEX INI YAZDRIN
        //once ılk o nun ındex ını buluruz
        //sonraa o ındex den sonrasında 2. o yu aratırız
        //"Java ıle kodlama cok kolay";


        int ılkOındexı=str.indexOf("o");
        int ıkıncıOındexı=str.indexOf("o",ılkOındexı +1);
        System.out.println(ılkOındexı + " " + ıkıncıOındexı);
    }
}
