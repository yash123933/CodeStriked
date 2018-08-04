
public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="imyash@gmail.com";
		int a1=email.indexOf('@');
		int a2=email.indexOf('.');
		if((a1-1)>=3&&(a2-a1)>3&&(email.length()-a2)>2) {
			System.out.println("Email is perfectly validated");
		}
		else
			System.out.println("Email is not valid");
	}
	

}


