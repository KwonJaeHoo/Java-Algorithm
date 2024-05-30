package studyfile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/68644

class Solution 
{
    public ArrayList<Integer> solution(int numbers[]) 
    {
    	ArrayList<Integer> answer = new ArrayList<>();
    	
        int result = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
        	for(int j = i+1; j < numbers.length; j++)
        	{
        		result = numbers[i] + numbers[j];
        			
        		if(answer.contains(result))
        			continue;
        		else
        			answer.add(result);
        	}
        }
        
        Collections.sort(answer);
        return answer;
    }
}
public class TwoPlusOne
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Solution solution = new Solution();
		ArrayList<Integer> arrayList = new ArrayList<>();

		
		int array1[] = {2, 1, 3, 4, 1};
		arrayList = solution.solution(array1);
		
		for(int i = 0; i < arrayList.size(); i++)
		{
			System.out.println(arrayList.get(i));
		}
		
	}
}