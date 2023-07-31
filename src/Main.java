import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your full name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
    	int numL = name.length();
    	System.out.println("El numero de letras es : " + numL);
    }

    private static void printNameCharacters( String name )
    {
       for (int cont = 0; cont < name.length(); cont++) {
        	System.out.println(name.charAt(cont));
        	
        }
    }


}