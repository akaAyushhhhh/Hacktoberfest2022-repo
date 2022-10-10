import java.sql.Array;
import java.util.Arrays;

public class MergerSortByRec {

    public static void main(String[] args) {
            int[] arr = {3,5,6,8,7,4};

            System.out.println(Arrays.toString(mergersort(arr)));
    }

        static int[] mergersort(int[] arr  )
        {
            if (arr.length==1)
            {
                return arr ;
            }

            int mid = arr.length / 2 ;
            int[] left= mergersort(Arrays.copyOfRange(arr,0,mid));
            int[] right = mergersort(Arrays.copyOfRange(arr,mid,arr.length));

            return  merge(left,right);


        }

     static int[] merge(int[] first , int[] second) {

        int[] mix = new int[first.length + second.length] ;
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while (i<first.length && j  <second.length)
        {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

         while (i < first.length) {
             mix[k] = first[i];
             i++;
             k++;
         }

         while (j < second.length) {
             mix[k] = second[j];
             j++;
             k++;
         }

        return  mix ;
    }
}
