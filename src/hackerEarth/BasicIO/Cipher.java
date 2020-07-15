package hackerEarth.BasicIO;

import java.util.Scanner;

public class Cipher {
	public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String msg = s.next(); 
        int k = s.nextInt();
        char[] ans= new char[msg.length()]; 
        int i=0;
        for(char c: msg.toCharArray()){
            if(isSymbol(c)){
               ans[i++] = c; 
            }else{
                int d = (int)c + (int)k;
                if(d > (int)'z' && c <= 'z' && c >='a' ){
                    ans[i++] = (char)((int)'a' + (d - 1 - (int)'z')%26);
                }else if(d > (int)'Z' && c <= 'Z' && c>= 'A'){
                    ans[i++] = (char)((int)'A' + (d - 1 - (int)'Z')%26);
                }else if(d > (int)'9' && c <= '9' && c>='0'){
                    ans[i++] = (char)((int)'0' + (d - 1 - (int)'9')%10);
                }else{
                    ans[i++] = (char)(c + k);
                }
            }
        }
        System.out.println(String.valueOf(ans));
    }

    private static boolean isSymbol(char c){
        if((c >='0' && c <= '9') || (c >='a' && c <= 'z') || (c >='A' && c <= 'Z'))
            return false;
        return true;
    }
}


