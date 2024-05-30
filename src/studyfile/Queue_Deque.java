package studyfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

//https://www.acmicpc.net/problem/18258

public class Queue_Deque
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		Deque deque = new LinkedList<>();
		int num = Integer.parseInt(bufferedReader.readLine());
		int value;
		String str;

		while(num > 0)
		{
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			str = stringTokenizer.nextToken();

			if(str.equals("push"))
			{	
				str = stringTokenizer.nextToken();
				deque.offer(Integer.parseInt(str));
			}
			
			else if(str.equals("pop"))
			{					
				if(deque.isEmpty())
					bufferedWriter.write(String.valueOf(-1) + "\n");
				else
					bufferedWriter.write(deque.poll() + "\n");
			}
			
			else if(str.equals("size"))				
				bufferedWriter.write(deque.size() + "\n");

			else if(str.equals("empty"))
			{	
				if(deque.isEmpty())
					bufferedWriter.write(1 + "\n");
				else
					bufferedWriter.write(0 + "\n");
			}
			else if(str.equals("front"))
			{
				if(deque.isEmpty())
					bufferedWriter.write(String.valueOf(-1) + "\n");
				else
					bufferedWriter.write(deque.peekFirst() + "\n");					
			}
			else if(str.equals("back"))
			{
				if(deque.isEmpty())
					bufferedWriter.write(String.valueOf(-1) + "\n");
				else
					bufferedWriter.write(deque.peekLast() + "\n");				
			}
			
			else
				continue;
			
			
			num--;
		}
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
