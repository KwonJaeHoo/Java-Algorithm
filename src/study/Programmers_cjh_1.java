//package study;
//
//import java.util.Scanner;
//
////https://school.programmers.co.kr/learn/courses/30/lessons/42889
//
//class SolutionGame
//{
//    public int[] solution(int N, int stages[]) 
//    {
//    	int answer[] = new int [N];
//        double failPercent[] = new double[N];	
//        //배열 0번째부터 N번째까지 실패율 
//        
//        int notSuccessPlayer = 0;		//stage 실패 count
//        //firstusePlayer
//        int Player = stages.length;		//stage 총 인구수	
//        int tmp = 1;					//stage 단계
//        int cnt = 0;					//while 멈춤용
//        int max = 0;
//        
//        while(cnt != N)
//        {
//        	for(int i = 0; i < stages.length; i++)
//            {
//            	if(stages[i] == tmp)
//            	{
//            		notSuccessPlayer++;
//            	}
//            }
//        	failPercent[cnt] = (double) notSuccessPlayer/Player;
//        	
//        	System.out.println(failPercent[cnt]);
//        	
//        	Player-= notSuccessPlayer;
//        	notSuccessPlayer = 0;
//        	tmp++;
//        	cnt++;
//        }	
//        
//        for(int i = 0; i < N; i++)
//        {	
//        	for(int j = 0; j < N; j++)
//        	{
//        		if(failPercent[j] >= (double)max)
//        		{
//
//        		}               	
//        	}
//        	answer[i] = (int) failPercent[i] + 1;
//        }
//                
//        return answer;
//    }
//}
//public class Programmers_cjh_1 
//{
//	public static void main(String[] args) 
//	{
//		Scanner in = new Scanner(System.in);
//		SolutionGame solutionGame = new SolutionGame();
//		int N = 5;								//전체 스테이지 갯수	
//		int stage[] = {2, 1, 2, 6, 2, 4, 3, 3};	//이용자가 현재 멈춰있는 스테이지 번호
//		
//		int print[] = solutionGame.solution(N, stage);
//		
//		for(int i = 0; i < print.length; i++)
//		{
//			System.out.print(print[i]);
//		}		
//	}
//}