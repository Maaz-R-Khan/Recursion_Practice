//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     int fact = factorial(10);
    System.out.println(fact);

    int fibo = fibonacci(15);
    System.out.println("The fibonacci of the entered value is " + fibo);

    }


    public static int factorial(int n) {
        if (n == 0) return 1; // Base Case
        else return n * factorial(n - 1); // Recursive Case
    }

    public static int fibonacci(int n) {
        if(n <= 2) return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }


}