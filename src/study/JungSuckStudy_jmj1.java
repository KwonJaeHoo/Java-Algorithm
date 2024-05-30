package study;

public class JungSuckStudy_jmj1 
{
	public static void main(String[] args) 
	{
		int coinUnit[] = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++)
		{
			int cnt = 0;
			
			while(money >= coinUnit[i])
			{
				money -= coinUnit[i];
				cnt++;
			}
			System.out.printf("%d원 : %d\n",coinUnit[i], cnt);
		}
	}
}