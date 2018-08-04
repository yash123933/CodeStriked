package college;

import java.util.Scanner;

public class find_first {
	static String a[] = new String[5];
	static char values[][]=new char [3][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of grammer statements");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter a grammer ");
			a[i] = reader.next(); 
		}
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<a[i].length();j++){
				if(a[i].charAt(j)=='='||a[i].charAt(j)=='/'){
					j+=1;
					if(Character.isLowerCase(a[i].charAt(j))){
						values[i][count++]=a[i].charAt(j);
					}
					else
					{
						for(int k=0;k<n;k++){
							if(a[k].charAt(0)==a[i].charAt(j)){
								for(int l=0;l<values[k].length;l++)
									values[i][count++]=values[k][l];
							}
						}
					}
				}
			}
		}
		for(int i=0;i<values.length;i++){
			System.out.print("For "+a[i].charAt(0)+":");
			for(int j=0;j<values[i].length;j++)
				System.out.print(values[i][j]);
			System.out.println();
		}
	}
}
