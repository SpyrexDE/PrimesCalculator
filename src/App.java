import java.io.Console;
import tools.PrimesCalculator;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Please enter the limit: ");
        Console console = System.console();
        int i = Integer.parseInt(console.readLine());
        System.out.println(PrimesCalculator.calcPrimes(i));
    }
}
