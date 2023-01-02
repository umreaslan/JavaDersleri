package day27_ovırrıdıng;

public class EParent  extends  DGrandParent{

    //@overrıdenotasyonu overrıden method ıle overrıdıng methodu ılıskılendırır
    //eger overrıden methodda bu ılıskıyı bozacak bır degısıklık yapılırsa
    //@overrıde CTE verır
    @Override
    protected void method2() {
        super.method2();
        System.out.println("P method1");
    }
     protected    void method1(){
        System.out.println("GP method1");

    }
    private  void  method3(){
        System.out.println("method3");
    }
}


