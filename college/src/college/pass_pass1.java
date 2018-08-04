package college;

import java.io.BufferedReader;

import java.io.FileReader;

public class pass_pass1 {
	static createTable a[] = new createTable[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c,mot[],dir[];
		int valBase=0, base=15;
		int count=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/MyProf/practise/src/practise/learn.txt"));
			BufferedReader cr = new BufferedReader(new FileReader("D:/MyProf/practise/src/practise/learn.txt"));
			while((c=br.readLine())!=null){
				String[] words = c.split("\\s");
				if(words[1]=="yash"||words[1]=="A"||words[1]=="ST")
			{
					count+=4;
				}
				else if(!words[0].equals("*")){
					a[0]=new createTable();
					a[0].setcreateTable(words[0], "R", count, 4);
				}
			}
			System.out.println("******************************pass2******************************");
			while((c=cr.readLine())!=null){
				String[] words = c.split("\\s");
			
				if(words[1].equals("yash")||words[1]=="A"||words[1]=="ST"){
					int val=searchWord(words[0]);
					int offset=val-valBase;
					System.out.println(words[1]+" "+words[2]+" "+offset+" ("+valBase+", "+base+")");
				}
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int searchWord(String string) {
		int i;
		for(i=0;i<a.length;i++){
			if(string.equals(a[i].getSymbol())){
				break;
			}
		}
		i=a[i].getlcval();
		return i;
	}
}
class createTable{
	String symbol, relocatable;
	int lcval,length;
 public void setcreateTable(String symbol,String relocatable,int lcval,int length){
	 this.symbol=symbol;
	 this.lcval=lcval;
	 this.relocatable=relocatable;
	 this.length=length;
 }
 public String getSymbol(){
	 return symbol;
 }
 String getReloca(){
	 return relocatable;
 }
 int getlcval(){
	 return lcval;
 }
 int getlength(){
	 return length;
 }
}