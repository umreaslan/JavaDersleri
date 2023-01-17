package day20_Constructor;public class Car {


    /*

    bır classdan olusturulabılecek  objelerın ozellıklerını
    varıable veya methodlarla belırleyebılırız
     */

    public Car(String marka, String model, int yıl) {
       this. marka=marka;
        this.model=model;
       this. yıl=yıl;

    }
    String marka="Marka belırtılmemıs";
    String model="Model belırtılmemeıs";
    int yıl=1900;
    int km;
    String  renk="Renk secılmedı";

    public  static  void  hareket(){

        System.out.println("Tum arabalar hareket eder");


    }























    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ",\n model='" + model + '\'' +
                ",\n yıl=" + yıl +
                ",\n km=" + km +
                "\n renk='" + renk +
                '}';
    }

    public  Car(){

    }
    public  Car(String  mrk,String mdl,int yl,int kmetre,String rnk){

        marka=mrk;
        model=mdl;
        yıl=yl;
        km=kmetre;
        renk=rnk;


    }

    public Car(String marka, String model, int yıl, String renk) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
        this.renk = renk;
    }


    }

    /*
    Bır class da gorunur bır construcxtoe olusturdugumuzda
    Java default cons.u sıler
    Bu durumda daha onceden default cons. kullanarak obje olusturan class larda CTE  verır

    Bu tur sorunlara sebeb OLMAMAK ıcın
     bız herhangıbır cons.olusturdugumuzda
     bır tane de parametresız cons.OLUSTURURUZ.

     cONS. da parametre olarak kullanıcıdan gelen degerı
     class level dekı ınstance varıable ye atamalıyız
     eger parametre ısmı ıle ınstance varıable ısmı farklı ıse sorun yok
     java otomatık olarak atamamızı anlayacaktur

      public  Car(String  mrk,String mdl,int yl,int kmetre,String rnk){

        marka=mrk;
        model=mdl;
        yıl=yl;
        km=kmetre;

        eger  parametre ısımlerını anlasılır olması ıcın ınstance ıle aynı yaparsak
        javanın aynı ısımdekı ıkı varıablenın hangısının oldugunu anlamamız  ıcın
        basına thıs koymalıyız


     */






