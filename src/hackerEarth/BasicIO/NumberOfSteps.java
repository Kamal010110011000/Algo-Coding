package hackerEarth.BasicIO;

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String args[] ){
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); 
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i =0; i< N; i++){
            A[i] = s.nextInt();
        }
        for(int i =0; i< N; i++){
            B[i] = s.nextInt();
        }
         int min = Integer.MAX_VALUE;
        for(int i =0; i<N; i++){
            min = Math.min(min,A[i]);
        }
        int count = 0;
        int i=0;
        while(i<N){
            if(A[i]<B[i] && A[i]!=min){
                System.out.println(-1);
                return;
            }
            else if(A[i]!=min && A[i]>=B[i]){
                int d = A[i] -min;
                if(d%B[i] == 0){
                    count+=d/B[i];
                    A[i]-=d;
                }else{
                    A[i]-=((d/B[i])+1)*B[i];
                    min = A[i];
                    count+=(d/B[i])+1;
                    i=0;
                    continue;
                }
                
            }
            i++;
        };
        System.out.println(count);

    }
}

