
public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="      -11919730356x";
		/*int len=s.length(),add=0;
		for(int i=0;i<len;i++){
			if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				add*= 10;
				add+=((int)s.charAt(i)-48);
			}
			else 
				break;
		}
		*/
	
	
	s=s.trim();
	int len=s.length(),sign=1,start=0,status=0;
	long add=0;
    if(len==0)
        System.out.println(0);
    if(s.charAt(0)=='-'){sign=-1;start=1;}
    else if(s.charAt(0)=='+'){start=1;}
        
	for(int i=start;i<len;i++){
		if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
			//if (i<11)
		{
			add*= 10;
			add+=((int)s.charAt(i)-48);}
			
		}
		else 
			break;
	}
	if((sign==1&&add<0)||(status==1&&sign==1))
        System.out.println (2147483647);
	else if(sign==-1&&add<=-2147483647&&s.charAt(10)>'8')
    	System.out.println((-1+add));
    System.out.println(sign*add);
	}

}




