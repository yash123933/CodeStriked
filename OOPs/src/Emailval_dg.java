
public class Emailval_dg {
public static void main(String[] args) {
	String email="imdh@gma.com";
	int a1 = email.indexOf('@');
	int a3 = email.lastIndexOf('@');
	int a2 = email.indexOf('.');
	int a4 = email.lastIndexOf('.');
	if(a1==a3 && a2==a4 &&  (a1-1)>=3 && (a2-1)>=6 && (a2+2)>=8)
	{
		System.out.println("email is valid");
	}
	else
	{
		System.out.println("email is invalid");

	}
	

}

}
