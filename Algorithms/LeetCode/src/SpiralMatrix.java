//import java.io.StreamTokenizer;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
		int lenC = a[0].length;
		int lenR = a.length;
		int moveC = lenC, moveR = lenR - 1, total = 1, totraverse = lenC * lenR, startR = -1, startC = -1;
		while (total <= totraverse) {
			if (total <= totraverse) {
				startR++;
				startC++;
				int i = 0;
				while (i < moveC) {
					System.out.println(a[startR][startC]);
					startC++;
					total++;
					i++;
				}
				moveC--;
			}
			if (total <= totraverse) {
				startC--;
				startR++;
				int i = 0;
				while (i < moveR) {
					System.out.println(a[startR][startC]);
					startR++;
					total++;
					i++;
				}
				moveR--;
			}
			if (total <= totraverse) {
				startR--;
				startC--;
				int i = 0;
				while (i < moveC) {
					System.out.println(a[startR][startC]);
					startC--;
					total++;
					i++;
				}
				moveC--;
			}
			if (total <= totraverse) {
				startR--;
				startC++;
				int i = 0;
				while (i < moveR) {
					System.out.println(a[startR][startC]);
					startR--;
					total++;
					i++;
				}
				moveR--;
			}

		}
	}
}
