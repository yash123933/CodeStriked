
public class xyz {
	public static void main(String[] args) {
		Node l =new Node();
		l.setLink(null);
		lc s = null;
		int a[]=new int[]{1,2,3,4};
		int b[]=new int[]{1,2,3,5,6};
		for(int i=0;i<4;i++)
		{
			s=new lc(a[i],l);
			s.start();
		}
//		s=new lc(45, l);
//		s.inserAtPos(2);
		s.add(b,4,l.getLink());
		for(int i=0;i<5;i++)
			System.out.println(b[i]);
	}
}
class lc{
	int value;
	Node v;
	public lc(int var,Node v) {
		// TODO Auto-generated constructor stub
		this.value=var;
		this.v=v;
	}
	public void start()
	{
		Node n = new Node ();
		if(v.getLink()==null)
		{
			n.setData(value);
			v.setLink(n);
		}
		else{
			Node x = v.getLink();
			while(x.getLink()!=null){
				x=x.getLink();
			}
			n.setData(value);
			x.setLink(n);
		}
	}
	public void display(){
		if(v.getLink()==null)
		{
			System.out.println("NO Data To Display");
		}
		else
		{
			Node x = v.getLink();
			while(x.getLink()!=null){
				System.out.println(x.getData());
				x=x.getLink();
			}
			System.out.println(x.getData());
		}
	}
	public int add(int a[],int length,Node y){
		if(y.getLink()==null){
			a[length]=a[length]+y.getData();
			return --length;
		}
		else
		{			
			int x=add(a,length,y.getLink());
			a[x]=y.getData()+a[x];		
			return --x;
		}
	}
	public void inserAtPos(int pos){
		Node n=new Node();
		n.setData(value);
		if(pos==1){
			n.setLink(v.getLink());
			v.setLink(n);
		}
		else {
			Node x=v.getLink();
			
			for(int i=1;i<pos-1&&x.getLink()!=null;i++){
				x=x.getLink();
			}
			n.setLink(x.getLink());
			x.setLink(n);
		}
	}
}
class Node{
	Node node;
	int data;
	public Node() {
		// TODO Auto-generated method stub
		node=null;
		data=0;
	}
	public void setData(int val){
		data = val;
	}
	public void setLink(Node n)
	{
		node=n;
	}
	public Node getLink()
	{
		return node;
	}
	public int getData()
	{
		return data;
	}
}
