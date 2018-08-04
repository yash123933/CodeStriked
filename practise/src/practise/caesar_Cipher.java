package practise;
import java.util.Scanner;
public class caesar_Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		String string=sc.next();
		int rotation=sc.nextInt();
		while(rotation>26){
			rotation-=26;
		}
		for(int i=0;i<length;i++)
		{	
			char c=string.charAt(i);
			int t=((int)c);
			if(t>64&&t<91||t>96&&t<123){
					t+=rotation;
				if(Character.isUpperCase(c)){
						if(t>90)
						{
							t=(t)%90;
							if(t<65)
								t+=64;
						}
				}
				else
				{
					if(t>122)
					{
						t=(t)%122;
						if(t<97)
							t+=96;
					}
				}
				c=(char)(t);
			}
			System.out.print(c);
		}
	}
}
