package ds;

import io.Input;

public class Fibonacci {
    public void run(){
        Input in= new Input();
        int n = in.valueInput("Enter how many fibonacci numbers to print:> ");
        fibonacci(n);
    }
    static void fibonacci(int n)
    {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
    
}
