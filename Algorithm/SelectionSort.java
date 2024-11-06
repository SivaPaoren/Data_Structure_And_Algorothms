import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
         int []arr = {1,6,8954,66,66,8,25,6,47,96,78,45,21,36,15,74,56,23,24,56,72};
        selectionSort(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num+" "));
    }
    static void selectionSort(int arr[]){
         int i,j;

         for(i=0;i<arr.length-1;i++){
             for(j=i+1;j<arr.length;j++){
                 if(arr[i] > arr[j]){
                     swap(arr,i,j);
                 }
             }
         }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
