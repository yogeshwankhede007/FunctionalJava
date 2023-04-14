package co.dataStructuresAndAlgo;

public class MergeArray {

    //Merge arrays
    public  static int[] mergeArrays(int[] arr1,int[] arr2){
        int s1 = arr1.length;
        int s2 = arr2.length;

        int [] resltArr = new int[s1+s2];
        int i = 0,j = 0,k=0;

        //tranverse both arrays
        while(i < s1 && j<s2){
            //check sum ele is 1st
            //arr is smaller to current ele

            if(arr1[i]<arr2[i])
                resltArr[k++]=arr1[i++];
            else
                resltArr[k++]=arr2[j++];
        }
        //store remaining ele of 1st & 2nd arr
        while (i < s1)
            resltArr[k++]=arr1[i++];
        while(j < s2)
            resltArr[k++]=arr2[j++];

        return resltArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 23, 45, 67, 76};
        int[] arr2 = {23,45,65,45,56};

        int[] resltArr = mergeArrays(arr1,arr2);

        System.out.println("Arrays after merging : ");
        for (int i =0; i< arr1.length+arr2.length; i++){
            System.out.print(resltArr[i]+" ");
        }
    }
}
