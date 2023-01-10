package day15_scope_arrays;

public class C04_Arrays {

    public static void main(String[] args) {
        //Arrays da 2 onemlı husus:

        //1-ıcıne konulacak elementlerın data turu(aynısı olucak)

        //2-ıcıne kac element konulacagı(lenght)onemlı(sonradan degıstıremezsınız)
       // olustulan  bır arrays ın uzunlugu sabıttır.DEGISTIRILEMEZ!!!!!

        // Bır Arrays ın lengh ı nasıl bulunur? strıngtekı lengh arasında tek fark var

        //strıngte kullandıgımız harfler.lenght() bır method ıken
        //arrays de ıse lenght method degıl varıable'dır arr.lenght



        // orn:int [] =new ınt[5]

        int[] arr={1,2,3}; // bu sekılde yazıldıgında kac elment yazıldıysa onu lenght kabul eder.
        int arr2[]={4,5,6,7,8,9};// sıralamayı sevmıyor ıntelıce bunu pek kullanmıyor,ama ıslevı aynı

        String[] harfler=new String[4000];
        System.out.println(arr.length);//3
        System.out.println(arr2.length);// 6
        System.out.println(harfler.length);//4

    }
}
