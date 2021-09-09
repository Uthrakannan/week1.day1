package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
			int maxNum = 8;
			int preNum = 0;
			int nxtNum = 1;
			for (int i = 1; i <= maxNum; i++) {
				System.out.print(preNum + " ");
				int sum = preNum + nxtNum;
				preNum = nxtNum;
				nxtNum = sum;
		

	}

}
}
