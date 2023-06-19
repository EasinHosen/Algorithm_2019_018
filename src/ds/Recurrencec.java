package ds;

public class Recurrencec {
    private int sum(int val){
        if(val>0){
            return val + sum(val-1);
        } else{
            return 0;
        }
    }

    public void run(){
        int value = 10;
        int result = sum(value);
        System.out.println("Factorial of "+ value +" using Recurrence is: "+result);
    }
}
