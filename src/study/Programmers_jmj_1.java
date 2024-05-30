package study;

import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12918

class Jmj_1
{
    public boolean solution(String s) 
    {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6)
          	if(s.matches("(^[0-9]*$)"))
            	answer = true;	
          	else
          		answer = false;
        else
        	answer = false;
        
        return answer;
    }
}

public class Programmers_jmj_1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Jmj_1 jmj = new Jmj_1();
		
		String s = "a234";
		System.out.println(s.length());
  		System.out.println(s.matches("(^[0-9]*$)"));
	}
}
