package day27_ovırrıdıng;

public class FChıld  extends  EParent{

    @Override
    protected void method2() {
        super.method2();

        //eger overıdıng method ıle bırlıkte overrıden methodda calıssın ıstersek
        //statıc prıvıte ve fınal  methodlar overrıde edılemez

    }

    @Override
    protected void method1() {
        super.method1();
    }
    public  void  method3(){
        System.out.println("Chıld method3");
        //parent class da  aynı ısımde method olmasına ragmen
        // overıde  olarak gorunmedı
        //sebeb: parenttekı method3  access modıfıere sahıp oldugundan overrıde edılemez
        //bagımsız bır method olarak kabul edılır
    }
}
