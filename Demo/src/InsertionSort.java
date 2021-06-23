import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int []arr = {1,6,8954,66,66,8,25,6,47,96,78,45,21,36,15,74,56,23,24,56,72};
        sort(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num+" "));
        
    }
    public static void sort(int arr[]){
       int size = arr.length;
       for(int i=1;i<size;i++){
            int value = arr[i];
            int index = i;
            while(index > 0 && arr[index-1]> value){
                 arr[index] = arr[index-1];
                 index--;
            }
            arr[index] = value;
       }
    }
}
