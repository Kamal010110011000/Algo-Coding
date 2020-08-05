package a;

import java.util.Scanner;

public class Problem1 {
//		static Stack<Character> stack = new Stack<>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int i =0; i<T; i++){
            int N = s.nextInt();
            int mat[][] = new int[N][N];
            for(int j =0; j<N; j++){
                for(int k =0; k<N; k++){
                    mat[j][k] = s.nextInt();
                }
            }

            int count=getPath(0,0, mat, 'N');
            System.out.println(count);
        }

    }
    static int getPath(int x, int y, int[][] mat, char pos){
        int n = mat.length;
        if(x<0 || y<0 || x>n-1 || y>n-1){
            return 0;
        }
        if(mat[x][y]==1){
            return 0;
        }
        if(x==n-1 && y==n-1){
            return 1;
        }

        if(pos=='L'){
            return getPath(x+1, y,mat, 'R')+getPath(x,y-1,mat, 'U')+getPath(x, y+1,mat, 'D');
        }

        if(pos=='R'){
            return getPath(x-1,y,mat,'L')+getPath(x,y-1,mat, 'U')+getPath(x, y+1,mat, 'D');
        }

        if(pos=='U'){
            return getPath(x-1,y,mat,'L')+getPath(x+1, y,mat, 'R')+getPath(x, y+1,mat, 'D');
        }

        if(pos=='D'){
            return getPath(x-1,y,mat,'L')+getPath(x+1, y,mat, 'R')+getPath(x,y-1,mat, 'U');
        }

        


            return getPath(x-1,y,mat,'L')+getPath(x+1, y,mat, 'R')+getPath(x,y-1,mat, 'U')+getPath(x, y+1,mat, 'D');

        
        
    }
}
