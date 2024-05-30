package studyfile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Queue
{
	public static ArrayList<Integer> arrayList = new ArrayList<>();
	public static int cnt = -1;
	
	public static void push(int num)
	{
		cnt++;
		arrayList.add(num);
	}
	
	public static void pop()
	{
		if(cnt > -1)
		{
			System.out.println(arrayList.remove(0));
			cnt--;
		}
		else
		{
			System.out.println(-1);
		}
	}
	public static void size()
	{
		System.out.println(arrayList.size());
	}
	public static void empty()
	{
		if(cnt > -1)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}
	}
	
	public static void front()
	{
		if(cnt > -1)
		{
			System.out.println(arrayList.get(0));
		}
		else
		{
			System.out.println(-1);
		}
	}
	public static void back()
	{
		if(cnt > -1)
		{
			System.out.println(arrayList.get(cnt));
		}
		else
		{
			System.out.println(-1);
		}
	}
}

public class QueueExample
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bufferedReader.readLine());
		int value;
		String str;
		
		
		while(num > 0)
		{
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			str = stringTokenizer.nextToken();

			if(str.equals("push"))
			{	
				str = stringTokenizer.nextToken();
				value = Integer.parseInt(str);
				Queue.push(value);
			}
			else if(str.equals("pop"))
			{
				Queue.pop();
			}
			else if(str.equals("size"))
			{
				Queue.size();
			}
			else if(str.equals("empty"))
			{
				Queue.empty();
			}
			else if(str.equals("front"))
			{
				Queue.front();
			}
			else if(str.equals("back"))
			{
				Queue.back();
			}
			else
			{
				continue;
			}
			num--;
		}
	}
}