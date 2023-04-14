//package co.dataStructuresAndAlgo;
//
//public class CheckSum {
//    public static int partition(int[] arr, int low, int high) {
//        int piot = arr[high];
//        int i = (low - 1); //index of smaller ele
//        for (int j = 0; j < high; j++) {
//            if (arr[j] <= piot) {
//                i++;
//
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        //swap
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//    }
//}
