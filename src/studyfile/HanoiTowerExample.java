package studyfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/11729

class HanoiTower
{
	final int first = 1;
	final int second = 2;
	final int third = 3;
	int cnt = 0;
	
	ArrayList<Integer> array1 = new ArrayList<>();
	ArrayList<Integer> array2 = new ArrayList<>();
	
	public int hanoi(int num, int first, int second, int third)
	{
		cnt++;
		if(num == 1)
		{
			array1.add(first);
			array2.add(third);
			
			return cnt;
		}
		else
		{
			hanoi(num-1, first, third, second);
			array1.add(first);
			array2.add(third);
			hanoi(num-1, second, first, third);
			return cnt;
		}
	}
}

public class HanoiTowerExample
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		HanoiTower hanoi = new HanoiTower();
	
		int num = Integer.parseInt(bufferedReader.readLine());
		
		bufferedWriter.write(String.valueOf(hanoi.hanoi(num, hanoi.first, hanoi.second, hanoi.third)));
		bufferedWriter.write("\n");
		for(int i = 0; i < hanoi.array1.size(); i++)
		{
			bufferedWriter.write(String.valueOf(hanoi.array1.get(i)));
			bufferedWriter.write(" ");
			bufferedWriter.write(String.valueOf(hanoi.array2.get(i)));
			bufferedWriter.write("\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}

//n = (3)
// hanoi (3, 1,2,3)
	// hanoi n-1(2, 1,3,2)
		//hanoi	n-1(1, 1,2,3)
		//-> first, third(1, 3) 			(1)
	//-> first, third(1, 2) 				(2)
		//hanoi n-1(1, 3,1,2)
		//-> first, third(3, 2) 			(3)	
//-> first, third(1, 3)						(4)
	//hanoi n-1(2, 2,1,3)
		//hanoi n-1(1, 2,3,1)
		//-> first, third(2, 1)				(5)
	//-> first, third(2, 3)					(6)
		//hanoi n-1(1, 1,2,3)
		//-> first, third(1, 3)				(7)