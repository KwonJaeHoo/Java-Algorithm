package study;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/132267

class Phg_1
{
	public int solution(int a, int b, int n) 
	{
		int answer = 0;
		
		while(n >= a)
		{
			answer += n/a * b;
			n = ((n / a) * b) + n % a;
		}
		return answer;
	}
}
public class Programmers_phg_1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Phg_1 solution = new Phg_1();
		
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		
		System.out.println(solution.solution(a, b, n));
	}
}