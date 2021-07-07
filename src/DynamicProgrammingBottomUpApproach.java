import java.util.Scanner;

public class DynamicProgrammingBottomUpApproach {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n <= 1)System.out.println("Fib("+n+") = "+n);
        else{
            System.out.println("Fib("+n+") = "+Fibonacci(n));
        }
        scanner.close();
    }

    public static int Fibonacci(int N){
          int[]Fib = new int[N+1];
          Fib[0] = 0;
          Fib[1] = 1;

          for(int i=2;i<=N;i++){
             Fib[i]= Fib[i-1]+Fib[i-2];
          }
          return Fib[N];
    }
}
