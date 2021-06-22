import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {1,6,8954,66,66,8,25,6,47,96,78,45,21,36,15,74,56,23,24,56,72};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num+" "));
    }
    public static void bubbleSort(int arr[]){
        int i,j,flag;
        for(i=0;i<arr.length-1;i++){
            flag = 0;
            for(j=0;j < arr.length-1-i ;j++){
                if(arr[j]>arr[j+1]){
                    SelectionSort.swap(arr, j, j+1);
                    flag = 1;
                }
            }
            if(flag == 0)break;
        }
    }
}
