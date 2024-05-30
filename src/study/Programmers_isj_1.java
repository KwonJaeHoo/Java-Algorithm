package study;

//https://school.programmers.co.kr/learn/courses/30/lessons/12948

class Isj_1
{
    public String solution(String phone_number) 
    {
        String answer1 = phone_number.substring(phone_number.length()-4);
        String answer2 = phone_number.substring(0, phone_number.length()-4);
        for(int i = 0; i < answer2.length(); i++)
        {
        	answer2 = answer2.replace(answer2.substring(i,i+1),"*");
        	System.out.println(answer2);
        }
        answer1 = answer2 + answer1;
        return answer1;
    }
}
public class Programmers_isj_1 
{
	public static void main(String[] args) 
	{
		Isj_1 isj = new Isj_1();
		String phone_number = "01033334444";
		System.out.println(isj.solution(phone_number));		
	}
}