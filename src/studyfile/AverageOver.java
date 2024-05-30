package studyfile;
import java.util.Scanner;

// https://www.acmicpc.net/problem/4344

public class AverageOver 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int num1 = in.nextInt(); 				// 반복횟수
		float score[] = new float[num1]; 

		for(int i = 0; i < num1; i++)
		{
			int num2 = in.nextInt();					
			int result[] = new int [num2]; 		// 입력받은 만큼의 배열 크기 생성, 각 입력값 만큼 반복하는동안 받을 성적
			float avg = 0;						// 성적 누적 변수
			
			for(int j = 0; j < num2; j++)
			{
				result[j] = in.nextInt();		
				avg += result[j];	
			}
			avg /= result.length;				//result.length == num2
			
			for(int j = 0; j < num2; j++)
			{
				if(result[j] > avg)
				{
					score[i] += (((avg / result.length) / avg) * 100);
				}
			}	
			System.out.printf("%.3f%%\n", score[i]);
		}		
	}
}