import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int []arr = {1,6,8954,66,66,8,25,6,47,96};
        
        mergeSort(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(num ->System.out.print(num+"|"));
    }

    public static void mergeSort(int arr[],int start,int end){
        if(start < end){
          int mid = (start+end)/2;
          mergeSort(arr,start,mid);
          mergeSort(arr, mid+1, end);
          merge(arr, start, mid, end);
        }
    }

    private static void merge(int[]arr , int start, int mid, int end) {
        int []temp = new int[end-start+1];
        
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i <= mid){
           temp[k] = arr[i];
           i++;
           k++;
        }

        while(j <= mid){
            temp[k] = arr[j];
            j++;
            k++;
         }
         k = 0;

         for(i = start;i <=end;i++){
           arr[i] = temp[k++];
         }
    }
}
