import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr = {1,6,8954,66,66,8,25,6,47,96};
        
        sort(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(num ->System.out.print(num+"|"));
    }
    public static void sort(int[]arr,int start,int end){
          if(start < end){
              int pIndex = partition(arr,start,end);
              sort(arr, start, pIndex-1);
              sort(arr, pIndex+1, end);
            }
          }


    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++){
            if(arr[i]  < pivot){
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        swap(arr, end, pIndex);
        return pIndex;
    }
    private static void swap(int[] arr, int i, int pIndex) {
        int temp = arr[i];
        arr[i] = arr[pIndex];
        arr[pIndex] = temp;
    }
    
    
}
