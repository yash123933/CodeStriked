
public class EmailVerification {

	public static void main(String[] args) {
		String email="imyash@gmail.com";
		int a1=email.indexOf('@'),a2=email.indexOf('.'), a3=email.lastIndexOf('@'),a4=email.lastIndexOf('.');
		System.out.println((a1-1)>=3&&(a2-a1)>3&&(email.length()-a2)>2&&a1==a3&&a2==a4 ? "valid":"Not valid");;
	}

}
