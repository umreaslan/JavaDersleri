package day19_ArrayLıst_forEachLOOp;

import java.util.ArrayList;
import java.util.List;

public class C07_ForEachLoopSoru {
    public static void main(String[] args) {

        int[] arr1={3,5,6,1,3,7};
        int[] arr2={3,8,9,4,5,11};
        List<Integer> ortakElementler=new ArrayList<>();


        for (int eachArr1:arr1
        ) {
            for (int eachArr2:arr2
            ) {

                if (eachArr1==eachArr2){
                    if (!ortakElementler.contains(eachArr1)){
                        ortakElementler.add(eachArr1);





                    }
    // verılen 2 arrayın elementlerını karsılastırıp
    //ıkısınde ortak olan elementelrı ayrı bır lıste olarak veren bır program yazın



    {

        System.out.println(ortakElementler);




                    }
                }


            }

        }


    }


}
