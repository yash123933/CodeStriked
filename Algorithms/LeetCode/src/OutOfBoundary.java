import java.util.Arrays;

public class OutOfBoundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=findPaths(6, 6,8 ,2, 2);
		System.out.println(x);
		
	}
	public static int findPaths(int m, int n, int N, int i, int j) {
		final int MOD = 1000000007;
		int result=0;
		int b[][]=new int [m][n];
		b[i][j]=1;
		int dirs[][]=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
	for(int steps=0;steps<N;steps++){
			int a[][]=new int [m][n];
			for(int k=0;k<m;k++){
				for(int l=0;l<n;l++){
					a[k][l]=b[k][l];
					b[k][l]=0;
				}
			}
			for(int r=0;r<m;r++){
				for(int c=0;c<n;c++){
					if(a[r][c]>0)
					{
						int val=0;
						for(int d[]:dirs){
							int nr=r+d[0];
							int nc=c+d[1];
							if(nr<0||nr>=m||nc<0||nc>=n)
								val++;
							else
								b[nr][nc]+=a[r][c];
						}
						result=(result+a[r][c]*val)%MOD;
						a[r][c]=0;
					}
				}
			}
		}
		return result;    
		
		
		
		
/*if (N <= 0) return 0;
        
        final int MOD = 1000000007;
        int[][] count = new int[m][n];
        count[i][j] = 1;
        int result = 0;
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for (int step = 0; step < N; step++) {
            int[][] temp = new int[m][n];
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    for (int[] d : dirs) {
                        int nr = r + d[0];
                        int nc = c + d[1];
                        if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                            result = (result + count[r][c]) % MOD;
                        }
                        else {
                            temp[nr][nc] = (temp[nr][nc] + count[r][c]) % MOD;
                        }
                    }
                }
            }
            count = temp;
        }
        
        return result;*/
	}

}
