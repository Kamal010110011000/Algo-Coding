package a;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

interface BaseI{ void method();} 

class BaseC{
	public void method() {
		Float f1 = new Float("3.0");
		System.out.println(f1.doubleValue()+f1.byteValue()+f1.intValue());
	}
}

public class Impl{

	static final Scanner s = new Scanner(System.in);
    public static void main(String args[] ) throws Exception {
        int n = s.nextInt();
        long r = s.nextLong();
        List<Long> arr = new LinkedList<>();
        while(n-- >0) {
        	arr.add(s.nextLong());
        }
        
        System.out.println(countTriplets(arr, r));

    }

    static long countTriplets(List<Long> arr, long r) {
        long count=0;
        int n = arr.size();
        long a,b,c;
        Map<Long,Long> rightmap = new HashMap<>();
        Map<Long,Long> leftmap = new HashMap<>();
        for(int i=0; i<n; i++){
            if(rightmap.containsKey(arr.get(i))){
                rightmap.put(arr.get(i), rightmap.get(arr.get(i))+1);
            }else{
                rightmap.put(arr.get(i),(long)1);
            } 
        }
        for(long no: arr){
            long countLeft = 0;
            long countRight = 0;
            long occur = rightmap.get(no); 
            long lhs = (no%r==0)?no/r:0;
            rightmap.put(no,occur - 1L);
            
            if(rightmap.containsKey(no*r)){
                countRight = rightmap.get(no*r);
            }
            if(leftmap.containsKey(lhs)){
                countLeft = leftmap.get(lhs);
            }
            count+=countRight*countLeft;
            if(leftmap.containsKey(no)){
                leftmap.put(no, leftmap.get(no)+1);
            }else{
                leftmap.put(no,(long)1);
            } 
        }
        
        return count;
    }
}

