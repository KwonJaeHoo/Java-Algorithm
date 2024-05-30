package study;

import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/120907

class Kyh_1
{
    public String[] solution(String quiz[]) 
    {
        String answer[] = new String[quiz.length];
        int a, b, result, sum;
        //  01234
        //3-4=-3
        for(int i = 0; i < quiz.length; i++)
        { 
        	String s[] = quiz[i].split(" ");
        	
        	a = Integer.parseInt(s[0]);
        	b = Integer.parseInt(s[2]);
        	sum = Integer.parseInt(s[4]);
        	
        	if(s[1].equals("-"))
        		result = a - b;		
        	        	
        	else
        		result = a + b;		

        	if(result == sum)
            	answer[i] = "O";
            else
            	answer[i] = "X";        	
        }
        return answer;
    }
}

public class Programmers_kyh_1 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Kyh_1 kyh = new Kyh_1();
		
		String quiz [] = {"3 - 4 = -3", "5 + 6 = 11"};
		String result[] = kyh.solution(quiz);
		
		for(int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}