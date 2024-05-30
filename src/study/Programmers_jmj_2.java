package study;

import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/118666

class Jmj_2
{
	public String solution(String[] survey, int[] choices) 
	{
        String answer = "";
        
        Map<String, String> map = new HashMap<>();

        	map.put(answer, answer);	
        
        return answer;
    }
}
public class Programmers_jmj_2 
{
	public static void main(String[] args) 
	{
		Jmj_2 jmj = new Jmj_2();
		String survey[] = {"AN", "CF", "MJ", "RT", "NA"};
		int choices[] = {5, 3, 2, 7, 5};
		
		System.out.println(jmj.solution(survey, choices));		
	}
}