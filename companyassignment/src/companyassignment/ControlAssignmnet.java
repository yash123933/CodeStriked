package companyassignment;

import java.util.Scanner;

public class ControlAssignmnet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				flag = true;
		if(flag==false)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}
