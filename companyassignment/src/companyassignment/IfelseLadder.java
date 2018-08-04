package companyassignment;

import java.util.Scanner;

public class IfelseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Marks for Maths, Physics, Chemistry");
		int Mat = sc.nextInt();
		int Phy = sc.nextInt();
		int Che = sc.nextInt();
		if (Mat >= 35 && Che >= 35 && Phy >= 35) {
			int Agg = (Mat + Phy + Che) / 3;
			if (Agg <= 59)
				System.out.println("Grade: C");
			else if (Agg <= 69)
				System.out.println("Grade: B");
			else
				System.out.println("Grade: A");
		} else
			System.out.println("Fail");

	}

}
