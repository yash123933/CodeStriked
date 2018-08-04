import java.util.HashMap;

public class parseLispExpression {
	static int f=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(let x 3 x 2)";
		String a[];
		int currentx=0,currenty=0;
		
		//s=s.replaceAll("[^\\w\\s]","");
		//a=s.split("[^\\w]");
		
		HashMap< String,Integer> hm = new HashMap< String,Integer>();
		StringBuilder result= new StringBuilder();
		for(int i=0;i<s.length();i++){
			char x=s.charAt(i);
			if(x=='('){
				result.append(x);
				result.append(" ");
			}
			else if(x==')'){
				result.append(" ");
				result.append(x);
			}
			else
				result.append(x);
		}
		int x[],y[],top1=0,top2=0;
		s=result.toString();
		a=s.split(" ");
	/*String current=null;
	int i=0;
		while(i<a.length){
			System.out.println(a[i]);
			if(a[i].equals("mult")||a[i].equals("let")||a[i].equals("add")||a[i].equals("(")||a[i].equals(")"))
				current=a[i];
			switch (current) {
			case "(":{
				i++;
				break;
			}
			case ")":{
				i++;
				break;
			}
			case "let":{
				i++;
				String z=a[i];
				i++;
				if(Character.isDigit(a[i].charAt(0))==true){
				int c=Integer.parseInt(a[i]);
				if(z.equals("x"))
					x[top1++]=c;
				else
					y[top2++]=c;
				}
				break;
			}
			case "mult":{
				break;
			}
			default:
				break;
			}			
		}*/
		int i=0;
		System.out.println();
		int c=process(a,f,hm);
		System.out.println(c);
	}
	static int process(String a[],int i,HashMap<String, Integer>hm){
		if(a[i].equals("let")){
			i++;
			while(true){
				if(!a[i+1].equals("(")&&!a[i+1].equals(")"))
				{
					hm.put(a[i], Integer.parseInt(a[++i]));
					i++;
				}
				else if(a[i+1].equals("(")==true){
					hm.put(a[i], process(a,i++,hm));
				}
				else if(a[i+1].equals(")")==true){
					i++;
					break;
				}
				else if(a[i].equals(")")==true)
					break;
			}
		}
		else if(a[i].equals("add")==true){
			i++;
			if(a[i].equals("(")){
				int x=process(a,i++,hm);
					if(Character.isDigit(a[f].charAt(0)))
						return (x+Integer.parseInt(a[f]));
					else
						return(x+hm.get(a[f]));
			}
			else if(!a[i].equals("(")&&!a[i+1].equals("(")){
				
			}
		}
		return hm.get("x");
	}
}
