package study;

import java.util.Scanner;

class Cjh_2
{
    public boolean solution(int x) 
    {
        //sum, number
        int sum = 0, number = x;
        while (number != 0)
        {
        	sum += number % 10;
        	number /= 10;
        }
        
        if(x % sum == 0)
        	return true;
        else
        	return false;
    }
}
public class Programmers_cjh_2 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Cjh_2 solution = new Cjh_2();
		int x = 10;
		
		System.out.println(solution.solution(x));		
	}
}