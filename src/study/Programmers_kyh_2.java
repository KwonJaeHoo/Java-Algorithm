package study;

//https://school.programmers.co.kr/learn/courses/30/lessons/144856?language=oracle

public class Programmers_kyh_2 
{
	public static void main(String[] args) 
	{
		/*
		 * 
		SELECT B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(BS.SALES * B.PRICE) AS TOTAL_SALES 
		
		FROM BOOK B, AUTHOR A, BOOK_SALES BS
		
		WHERE B.AUTHOR_ID = A.AUTHOR_ID
		AND B.BOOK_ID = BS.BOOK_ID
		AND TO_CHAR(BS.SALES_DATE, 'YYYYMM') = '202201'
		
		GROUP BY B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY
		ORDER BY AUTHOR_ID ASC, CATEGORY DESC;


		 */
	}

}
