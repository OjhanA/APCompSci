import java.util.Scanner;  
public class TestFib {   
    public static void main(String[] args)     {
        System.out.print("\f");
        int n, fib;  
        Scanner scan = new Scanner(System.in);  
        System.out.print("Enter an integer: ");
        n = scan.nextInt();  
        fib = Fib.fib1(n); 
        System.out.println("Fib(" + n + ") is " + fib);  
        
        System.out.println();
        
        System.out.print("Enter an integer: ");
        n = scan.nextInt();  
        fib = Fib.fib2(n); 
        System.out.println("Fib(" + n + ") is " + fib);  
    } 
}