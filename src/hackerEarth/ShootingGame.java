package hackerEarth;

import java.util.*;

public class ShootingGame {

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int X,Y,N,W;
        double P1,P2;
        int T = s.nextInt();
        for(int i =0; i<T; i++){
            X = s.nextInt();
            Y = s.nextInt();
            N = s.nextInt();
            W = s.nextInt();
            P1 = s.nextDouble() / 100;
            P2 = s.nextDouble() / 100;

            getWinningProb(X,Y,N,W,P1,P2);
        }
        s.close();

    }

    static void getWinningProb(int x, int y, int n, int w, double p1, double p2){
        if(p1<p2){
            getProb(y,x,n,w,p2,p1);
        }else{
            getProb(x,y,n,w,p1,p2);
        }
    }

    static void getProb(int x, int y, int n, int w, double p1, double p2){
        double ans = Math.pow(p1, n);
        int points = x*n;
        while(points>w){
            points -= x;
            ans /= p1;
        }
//        ans *=p1;
//        points +=x;
        for(int i = n-1; points<w && i>0; i-- ){
            ans = Math.pow(p1, i) * Math.pow(p2, n-i);
            points = x*i + y*(n-1);
        }
        System.out.printf("%.6f",ans*100);
    }
}
//TestCases
//1 4 3 6 90 50 ans-
//2 3 2 5 50 25 ans- 12.500000
