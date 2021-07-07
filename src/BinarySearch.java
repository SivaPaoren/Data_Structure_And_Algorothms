public class BinarySearch {

    public static int binarySearch(int[]arr,int key){
       int left = 0;
       int right = arr.length-1;

       while(left <= right){
           int mid = left+(right-left)/2;
           if(arr[mid] == key){
               return 1;
           }else if(arr[mid] > key){
               right = mid-1;
           }else{
               left = mid+1;
           }
       }
       return 0;
    }
    public static void main(String[] args) throws Exception {
       int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int key = 15;
        int search = binarySearch(arr, key);

        if(search == 1)System.out.println("Key found");
        else System.out.println("Key does not exist");
    }
}
