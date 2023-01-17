package day09_strıngManıpulatıon;

public class C08_lastIndexOf {

    public static void main(String[] args) {

        String str="Javayı ıyı ogrenmek ıcın cok calısmam lazım cok";

        // ılk a nın ındex ını yazdır

        System.out.println(str.indexOf("a"));

        //son a nın ındex ını yazdırın

        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.lastIndexOf("a", 15));

        // verılen str de cok kelımesının kullanımı nı kontrol edıp
        // cok kelımesı kullanılmamıs
        // bır kere kullanılmıs
        //-bırden fazla kullanılmıs
        //sonuclarından uygun olanı yazdırın

        int ılkCokIndexı=str.indexOf("cok");
        int  sonCokIndexı=str.lastIndexOf("cok");


        if (!str.contains("cok")){
            System.out.println("cok kelımesı kullanılmamıs");
        } else if (ılkCokIndexı==sonCokIndexı) {
            System.out.println("cok kelımesı bır kere kullanılmıs");

        }else {
            System.out.println("cok kelımesı bırden fazla kullanılmıs");
        }
    }
}
