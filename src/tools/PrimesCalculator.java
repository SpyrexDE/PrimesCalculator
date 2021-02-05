package tools;

import java.util.ArrayList;

public class PrimesCalculator 
{
    public static ArrayList<Integer> calcPrimes(int max)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>();

        numbers.add(2);
        for(int i = 3; i < max; i++)
        {
            if(i % numbers.get(0) != 0)
            {
                numbers.add(i);
            }
        }

        primes.add(numbers.remove(0));
        

        while(numbers.size() > 0)
        {
            for(int i = 0; i+1<numbers.size(); i++){
                if(numbers.get(i) % numbers.get(0) == 0 && numbers.get(i) != numbers.get(0))
                {
                    numbers.remove(i);
                }
            }
            primes.add(numbers.remove(0));
        }

        primes.remove(primes.size()-1);

        return primes;
    }
}
