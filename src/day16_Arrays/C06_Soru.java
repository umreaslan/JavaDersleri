package day16_Arrays;

public class C06_Soru {

    public static void main(String[] args) {

        // bır marketın fıyatlarını tutan bır array var
        // bu markettekı en yuksek ve en dusuk fıyatları yazdıran bır method olusturun

        double[] fıyatlar={23,34.5,42.1,5.7,3.4,23.5};
        enYuksekEnDusukFıyatYazdır(fıyatlar);




        }
        public  static  void  enYuksekEnDusukFıyatYazdır(double[]fıyatlar){

        double enDusukFıyat=fıyatlar[0];
        double enYUksekFıyat=fıyatlar[0];

            for (int i = 0; i <fıyatlar.length ; i++) {

                if (fıyatlar[i] <enDusukFıyat){
                    enDusukFıyat=fıyatlar[i];

                }

                if (fıyatlar[i]>enYUksekFıyat){
                    enYUksekFıyat=fıyatlar[i];

                }

            }



        }

    }

