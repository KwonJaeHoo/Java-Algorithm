package study;
import java.util.Scanner;

public class Study_Array_isj_1
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		//데이터는 [4,4]부터 삽입, 출력은 [0,0]부터
		int array[][] = new int [5][5];
		int num = 21;
		
		for(int i = array.length-1; i > -1 ; i--)
		{
			for(int j = array[0].length-1; j > -1 ; j--)
			{
				array[i][j] = num;
				num++;
			}
		}

		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[0].length; j++)
			{
				System.out.printf("%d \t", array[i][j]);
			}
			System.out.println();
		}
		
//---------------------------------------------------------------------
		System.out.println();
		
		//데이터는 [0,0]부터 삽입, 출력은 [4,4]부터
		int array1[][] = new int [5][5];
		int num1 = 21;
		for(int i = 0; i < array1.length; i++)
		{
			for(int j = 0; j < array1[0].length; j++)
			{
				array1[i][j] = num1;
				num1++;
			}
		}
		
		for(int i = array1.length-1; i > -1; i--)
		{
			for(int j = array1[0].length-1; j > -1; j--)
			{
				System.out.printf("%d \t", array1[i][j]);
			}
			System.out.println();
		}
	}
}