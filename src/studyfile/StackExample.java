package studyfile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10828

class Stack
{
	public static ArrayList<Integer> arrayList = new ArrayList<>();
	static int cnt = -1;
	
	public static void push(int n)
	{
		++cnt;
		arrayList.add(n);
	}
	
	public static void pop()
	{
		if(cnt > -1)
		{
			System.out.println(arrayList.remove(cnt--));	
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

	public static void top()
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

public class StackExample
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bufferedReader.readLine());
		int value;
		String stack;

		while(num > 0)
		{
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			stack = stringTokenizer.nextToken();
			if(stack.equals("push"))
			{
				stack = stringTokenizer.nextToken(); 
				value = Integer.parseInt(stack);
				Stack.push(value);
			}
			else if(stack.equals("pop"))
			{
				Stack.pop();
			}
			else if(stack.equals("size"))
			{
				Stack.size();
			}
			else if(stack.equals("empty"))
			{
				Stack.empty();
			}
			else if(stack.equals("top"))
			{
				Stack.top();
			}
			else
			{
				continue;
			}
			num--;
		}		
	}
}
