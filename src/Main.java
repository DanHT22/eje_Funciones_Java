import java.util.Scanner;

public class Main{
	
    	   public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("ingresa dos numeros : ");
    	        int a = scanner.nextInt();
    	        int b = scanner.nextInt();

    	        System.out.println("la suma es: " + sum(a, b));
    	        System.out.println("la resta es: " + rest(a, b));
    	        System.out.println("la multiplicacion es: " + multi(a, b));
    	        System.out.println("la division es: " + divi(a, b));

    	    }
    	    private static int sum (int a, int b) {
    	        return (a + b);
    	    }
    	    private static int rest (int a, int b) {
    	        return (a - b);
    	    }
    	    private static int multi (int a, int b) {
    	        return (a * b);
    	    }
    	    private static double divi (double a, double b) {
    	        return (a / b);
    	    }
    	}
    