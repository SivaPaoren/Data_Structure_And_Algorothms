
public class TopDownMemoizationApproach {
    public static void main(String[] args) {
        Fib fib = new Fib();
        //generate the required array
        fib.initF();
        fib.dynamicFabinacci(1);

        for(int i:fib.result){
             System.out.print(i+" ");
        }
    }
}

class Fib{
    static int[] result = new int[50];

    public static void initF(){
        for(int i=0;i<50;i++){
            result[i] = -1;
        }
    }

    public int dynamicFabinacci(int n){
         if(result[n] == -1){
             if(n <= 1)result[n] = n;
             else{
                result[n] = dynamicFabinacci(n-1)+dynamicFabinacci(n-2);
            }
         }
         return result[n];
    }
}
