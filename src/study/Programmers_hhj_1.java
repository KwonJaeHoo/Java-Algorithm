package study;
import java.util.Scanner;
import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909

class Hhj_1
{
	public static Stack stack = new Stack();
    	
	boolean solution(String s) 
    {
    	boolean answer = true;
    	
    	int cnt = 0;
    	
    	for(int i = 0; i < s.length(); i++)
    	{
    		if(s.charAt(i) == '(')
    		{
    			stack.push(s.charAt(i));
    		}
    		else
    		{
    			if(stack.empty())
    			{
    				answer = false;
    			}
    			else
    			{
    				stack.pop();
       			} 			
    		}
    	}
    	
    	if(!stack.empty())
    	{
    		answer = false;
    	}
        return answer;
    }
}

//연산이 전부 끝났을 때 
//stack -> null -> true
//stack -> not null -> false

//연산이 전부 끝나지 않았을 때
//stack -> not null -> 계속 진행
//stack -> null -> false


public class Programmers_hhj_1
{
	public static void main(String[] args) 
	{
		Hhj_1 solution = new Hhj_1();
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		System.out.println(solution.solution(s));
	}
}