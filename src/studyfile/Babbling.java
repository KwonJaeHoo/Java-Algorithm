package studyfile;
import java.io.IOException;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/120956

class Babbling_solution
{
    public int solution(String[] babbling) 
    {
    	int answer = 0;
    	
    	String say[] = {"aya", "ye", "woo", "ma"};	
    	for(int i = 0; i < babbling.length; i++)
    	{
        	for(int j = 0; j < say.length; j++)
        	{
        		if(babbling[i].contains(say[j]))
        		{
        			babbling[i] = babbling[i].replace(say[j], " ");
        			babbling[i] = babbling[i].trim();
        		}
        	}
        	System.out.println(babbling[i]);
        	
        	if(babbling[i].equals(""))
        	{
        		answer++;
        	}
    	}
        return answer;
    }
}

public class Babbling
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		Babbling_solution solution = new Babbling_solution();
		
		String str[] = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};	
//		String str[] = {"aya", "yee", "u", "maa", "wyeoo"};	
		
		int a = solution.solution(str);
		System.out.println(a);
	}
}