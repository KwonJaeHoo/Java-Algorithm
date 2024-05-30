package study;

import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/155652

//65 - 96 A-Z
//97 - 122 a-z

class Hhj_2
{
	public String solution(String s, String skip, int index) 
	{
		String answer = "";
        //i, c, cnt
        int i = 0;
        int cnt = 0;
        char c[] = s.toCharArray();
        
        while(cnt != s.length())
        {
        	while(i != index)
        	{		  
        		c[cnt]++;
        		
        		if(c[cnt] > 122)
        			c[cnt] = 97;

        		if(skip.contains(String.valueOf(c[cnt])))
        			continue;
        		i++;
        	}
        	
        	i = 0;
        	cnt++;
        }
        answer = String.valueOf(c);
        return answer;
    }
}

public class Programmers_hhj_2 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Hhj_2 hhj = new Hhj_2();	
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
			
		System.out.println(hhj.solution(s, skip, index));
		
		s = "a";
		skip = "bcdefghijk";
		index = 20;
		
		System.out.println(hhj.solution(s, skip, index));

		s = "zzzzz";
		skip = "a";
		index = 1;
		
		System.out.println(hhj.solution(s, skip, index));
	}
}