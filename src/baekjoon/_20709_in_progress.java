package baekjoon;

import java.util.Scanner;

public class _20709_in_progress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String balloon[][] = new String[count][2];
		for (int i = 0; i < balloon.length; i++) {
			for(int j=0 ; j < 2; j++) {
				balloon[i][j] = sc.next();
				String a[] = balloon[i][j].split(""); // 2차원배열 2열만 split
////				int[] getColumn(int[][] matrix, int column) {
////				    return IntStream.range(0, matrix.length)
////				        .map(i -> matrix[i][column]).toArray(); // 람다식보고 다시 공부..ㅠ.ㅠ
//				}
			}
		}

	}

}
