package companyassignment;

import java.util.Scanner;

public class LoopAssignmnet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i < 100) {
				if (i % 10 != 0)
					System.out.println(i);
				else
					continue;
			} else
				break;
		}
		int i = 0;
		while (i <= num) {
			if (i < 100) {
				if (i % 10 != 0)
					System.out.println(i);
				i++;
			} else
				break;
		}
		i = 0;
		do {
			if (i < 100) {
				if (i % 10 != 0)
					System.out.println(i);
				i++;
			} else
				break;

		} while (i <= num);

	}
}
