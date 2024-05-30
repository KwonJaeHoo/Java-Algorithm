package study;

import java.util.ArrayList;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973


//i = 0, size 1 b
//i = 1, size 2 a -- false
//i = 2, size 3 a -- true
//i = 3, size 2 b -- true
//i = 4, size 1 a
//i = 5, size 2 a -- true

class Hhj_3
{
    public int solution(String s)
    {
        int answer = -1;
        ArrayList<Character> arrayList = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++)
        {
        	arrayList.add(s.charAt(i));
        	
        	if(arrayList.size() > 1 && arrayList.get(arrayList.size()-1) == arrayList.get(arrayList.size()-2))
        	{
        		for(int j = 2; j > 0; j--)
        			arrayList.remove(arrayList.size()-j);
//        		arrayList.remove(arrayList.size()-2);
//        		arrayList.remove(arrayList.size()-1);
        	}
        }
        return answer = arrayList.size() == 0 ? 1 : 0;
    }
}

public class Programmers_hhj_3 
{
	public static void main(String[] args) 
	{
		Hhj_3 hhj = new Hhj_3();
		
		String s = "baabaa";
		System.out.println(hhj.solution(s));
		
	}
}
