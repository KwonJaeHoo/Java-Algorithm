package study;

//https://school.programmers.co.kr/learn/courses/30/lessons/12943

class Phg_2
{
    public int solution(long num) 
    {
    	//int형으로 626331 하면 오버플로우 발생함
    	
        int answer = 0;
        
        while(num != 1)
        {
        	if(answer == 500) 
        	{
        		answer = -1;
        		break;
        	}        	
        	if(num % 2 == 0)
        		num /= 2;
        	else
        		num = (num * 3) + 1; 
        	answer++;
        }
        return answer;
    }
}
public class Programmers_phg_2 
{
	public static void main(String[] args) 
	{
		Phg_2 phg = new Phg_2();
		System.out.println(phg.solution(626331));
	}
}