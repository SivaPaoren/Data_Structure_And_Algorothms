import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.transform.Result;

public class TopDownMemoizationApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n <= 1)System.out.println("Fib("+n+") = "+n);
        else{
            System.out.println("Fib("+n+") = "+Fibonacci(n));
        }
        scanner.close();
    }
}

class TopDown{
    List<Integer> numbers;

    public TopDown(){
       numbers = new ArrayList<>();
    }
}
