package study;

import java.util.ArrayList;

//https://school.programmers.co.kr/learn/courses/30/lessons/133502

class Ojh_1
{
    public int solution(int[] ingredient) 
    {
    	int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < ingredient.length; i++)
        {
        	arrayList.add(ingredient[i]);

        	if(arrayList.size() > 3 && arrayList.get(arrayList.size()-1) == 1 && arrayList.get(arrayList.size()-2) == 3 && 
        				arrayList.get(arrayList.size()-3) == 2 && arrayList.get(arrayList.size()-4) == 1)
        	{	
        		for(int j = 4; j > 0; j--)
        			arrayList.remove(arrayList.size()-j);
        		answer++;
        	}
        }
        return answer;
    }
}
public class Programmers_ojh_1 
{
	public static void main(String[] args) 
	{
		Ojh_1 ojh = new Ojh_1();
		
		int ingredient[] = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		System.out.println(ojh.solution(ingredient));		
	}
}