package studyfile;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10870

class FibonacciRecursive
{
	public static int fibonacciMethod(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		else
		{
			return fibonacciMethod(n-1) + fibonacciMethod(n-2);
		}
	}
}
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		System.out.println(FibonacciRecursive.fibonacciMethod(n));
		
		in.close();
	}
}