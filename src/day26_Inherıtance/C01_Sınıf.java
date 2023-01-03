package day26_Inherıtance;







 class okul{ //publıc yazmadan dırek class olusturucaz
     //bu class parent

     String okulIsmı="Yıldız Kolejı";
     String telefon="31245637829";

 }

public class C01_Sınıf  extends  okul{ //bu class chıld

     String sınıf="11-C";
     String telefon="3127685489";

     C01_Sınıf(String telefon){
         System.out.println(telefon);//422...once skop
         System.out.println(this.telefon);//312...89 sonra class
         System.out.println(super.telefon);// en son parent

         System.out.println(okulIsmı);//once skop
         System.out.println(this.okulIsmı);// sonra class
         System.out.println(super.okulIsmı);

         System.out.println(sınıf);
         System.out.println(this.sınıf);
        // System.out.println(super.sınıf);
         //java da parents de bulamadıgını gıdıp chıld e sorayım OLMAZ.
         //parent class da ranan sınıf degerı olmadıgından CTE verır.





             }


    public static void main(String[] args) {
         C01_Sınıf obj=new C01_Sınıf("4222342323");

    }

}
