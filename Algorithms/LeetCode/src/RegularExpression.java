
public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean ans= isMatch("aasdfasdfasdfasdfas","aasdf.*asdf.*asdf.*asdf.*s");
		boolean ans=isMatch("aabyc", "a*b.c");
		System.out.println(ans);
	}

	private static boolean isMatch(String s, String p) {
		// TODO Auto-generated method stub
		 
	        /*if(s.equals(p))
	            return true;
	        if(p.charAt(0)=='*')
	            return false;
	        if(p.length()==2&&p.charAt(0)=='.'&&p.charAt(1)=='*')
	        	return true;
	        int select = 0,i=0;
	        while(select<lengthP && i<lengthS)
	        {
	        	char current=s.charAt(i);
	        	if(p.charAt(select)=='*')
	        		select--;
	        	if(s.charAt(i)==p.charAt(select)||p.charAt(select)=='.'){
	        		select++;
	        		i++;
	        	}
	        	else if(select+1<lengthP && p.charAt(++select)=='*'){
	        		select++;
	        	}
	        	else
	        		return false;
	        		
	        }
	        if(select==lengthP&&i==lengthS)
	        	return true;
	        if(select+1==lengthP && p.charAt(select)=='*' && i==lengthS)
	        	return true;
	        if(select<lengthP-1&&p.charAt(select)=='*'&&i==lengthS)
	        {
	            int t=lengthP-1;i--;
	            while(i>-1 &&t!=select ){
	            	if(p.charAt(t)==s.charAt(i)||p.charAt(t)=='.'){
	            		t--;
	            		i--;
	            	}
	            	else if(p.charAt(t)=='*'){
	            		t-=2;
	            	}
	            	else
	            		return false;
	            	
	            }
	            boolean x=(t==select)?true:false;
	                 return x;
	        }
	        if(select+2==lengthP&&p.charAt(select+1)=='*')
	            return true;
	        else
	        	return false;*/
	        p="#"+p;
	        s="#"+s;
	        int lengthP=p.length();
	        int lengthS=s.length();
	        boolean a[][]=new boolean[lengthS+1][lengthP+1];
	        a[0][0]=true;
	        a[1][1]=true;
	        for(int k=1;k<lengthP;k++){
	        	if(p.charAt(k)=='*')
        		a[1][k+1]=a[1][k-1];
	        }
	        	
      for(int i=1;i<lengthS;i++){
    	  char var=s.charAt(i);
    	  for(int j=1;j<lengthP;j++){
    		  char var1=p.charAt(j);
    		  if(var==var1||var1=='.')
    			  a[i+1][j+1]=a[i][j];
    		  else if(var1=='*'){
    				  a[i+1][j+1]=a[i+1][j-1];
    			  if(p.charAt(j-1)=='.'||p.charAt(j-1)==var)
    				  a[i+1][j+1]=a[i][j+1] | a[i+1][j-1] ;
    			  }
    		  }
    	  }
      return a[lengthS][lengthS];
      }
	        
	}


