import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {

        int []arr = {1,6,8954,66,66,8,25,6,47,96};
        
        heapSort(arr);

        Arrays.stream(arr).forEach(num ->System.out.print(num+"|"));

    }

    static void buildHeap(int arr[]){
       int size = arr.length-1;
       for(int i=size/2;i>=0;i--){
           heapify(arr,i,size);
       }
    }

    private static void heapify(int[] arr, int index, int size) {
        int left = (2*index)+1;
        int right = left+1;

        int max = index;

        if(left <= size && arr[left] > arr[max]){
            max = left;
        }
        if(right <= size && arr[right] > arr[max]){
            max = right;
        }

        if(index != max){
            swap(arr,max,index);
            heapify(arr, max, size);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapSort(int arr[]){
        buildHeap(arr);
        int size = arr.length-1;
        while(size > 0){
           swap(arr, 0, size);
           size--;
           heapify(arr, 0, size);
        }
    }
}
