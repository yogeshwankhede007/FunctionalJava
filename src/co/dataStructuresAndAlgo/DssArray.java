package co.dataStructuresAndAlgo;

/**
 * An array is a linear data structure because each element is connected with the elements before and after it.
 * Int an array
 * NegativeArraySizeException- common error
 *
 */
public class DssArray {
    //Option 1
    int a[] = new int[5];

    public static void main(String[] args) {
        //option 2
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(a.length);
        //Simple for loop
        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]);
            //For Each loop
                 for (int i1 : a) {
                     System.out.println(i1);

                 }
            {

            }
        }}


}
