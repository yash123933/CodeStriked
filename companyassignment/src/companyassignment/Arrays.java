package assignments;

public class Arrays {

	public static void main(String[] args) {
		
		String str[] = new String[4];
		//{"hi","how","are","you"};
		
		str[0] ="hi";
		str[1]="how";
		str[2] ="are";
		str[3] ="you";
		
		System.out.println("original string array");
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("reversed array");
		for(int j=str.length;j>0;j--) {
			System.out.println(str[j-1]);
		}
	}

}
