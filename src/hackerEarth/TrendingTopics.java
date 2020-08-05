package hackerEarth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TrendingTopics {
	static final Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Post[] post;
        int N = s.nextInt();
        int id,z;
        long p,l,c,sh;
        post = new Post[N];
        for(int i =0; i<N; i++){
            id=s.nextInt();
            z=s.nextInt();
            p=s.nextLong();
            l=s.nextLong();
            c=s.nextLong();
            sh=s.nextLong();
            post[i] = new Post(id,z,p,l,c,sh);
        }

        Arrays.sort(post, new PostCompare());
        
        

        for(int i = 0; i<5; i++){
            System.out.println(post[i].id+" "+post[i].total);
        }

    }

}
class Post{
        int id,z, inc;
        long p,l,c,s,total;
        public Post(int id, int z, long p, long l, long c, long s){
            this.id = id;
            this.z = z;
            this.p = p;
            this.l = l;
            this.c = c;
            this.s = s;
            this.total = p*50+l*5+c*10+s*20;
            this.inc = (int)(total-z);
        }


    }

class PostCompare implements Comparator<Post>{
    @Override
    public int compare(Post p1, Post p2) {
    	if(p1.inc == p2.inc) {
    		return p2.id - p1.id;
    	}
        return p2.inc - p1.inc;
    }
}