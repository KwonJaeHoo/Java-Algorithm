package studyfile;
import java.util.Scanner;

// https://www.acmicpc.net/problem/27433

class Factorial
{
	public long factorial(Long n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{			
			return n * factorial(n-1);
		}
	}
}
public class FactorialExample
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Factorial factorial = new Factorial();

		long n = in.nextLong();
		System.out.println(factorial.factorial(n));
	}

}