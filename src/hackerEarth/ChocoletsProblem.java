package hackerEarth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChocoletsProblem {
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i =0; i<T; i++) {
			int N = s.nextInt();
			int K = s.nextInt();
			Set<String> set[] =new Set[N];
			for(int j = 0; j<N; j++) {
				int P = s.nextInt();
				set[j] = new HashSet<>();
				for(int k =0; k<P; k++) {
					set[j].add(s.next());
				}
			}
			int ans = findMinChocolets(set, K);
			System.out.println(ans);
		}
		
		
	}
	
	private static int findMinChocolets(Set<String>[] set, int K) {
		Set<String> pSet = new HashSet<>();
		Set<String> cBest = new HashSet<>();
		for(int i = 0; i<set.length; i++) {
			if(set[i].size()>=K) {
				return 1;
			}
		}
		
		Arrays.sort(set, (Set o1, Set o2) -> o2.size() - o1.size());
		pSet.addAll(set[0]);
		cBest.addAll(pSet);
		int best = pSet.size();
		int p=0;
		for(int i =1 ; i<set.length; i++) {
			p=i;
			Set<String> cSet = pSet;
			for(int j =i; j<set.length; j++) {
				cSet.addAll(set[j]);
				if(best<cSet.size()) {
					best = cSet.size();
					p = j;
				}
				cSet = pSet;
			}
			pSet.addAll(set[p]);
			if(pSet.size()>=K) {
				return i+1;
			}
		}
		
		return -1;
	}
	
//	1
//	3 4
//	3 FIVESTAR KITKAT MUNCH
//	3 FIVESTAR KITKAT MUNCH
//	2 KITKAT PERK
	
	

}
