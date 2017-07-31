package p1;
/*
 * liuxining
 * 2017年07月31日23:41:51
 */
import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(reverse(x));
		scan.close();
	}
	
    public static int reverse(int x) {
    		int x_bc = x;
        int c = 1;
        int c2 = 1;
        int ri = 0;
        int n = 0;
        int f = 0;
        //计算位数
        while(x_bc != 0){
        		x_bc /= 10;
        		n++;
        }
        if(n == 10){
        		if(x > 0){
        			f = Integer.MAX_VALUE;
        		}
        		else{
        			f = Integer.MIN_VALUE;
        		}
        }
        for(int i = 0;i < n - 1;i++){
        		c *= 10;
        }
        	for(int i = 0;i < n;i++){
        		int xc = x / c;
        		int riz = xc * c2;
        		if(i == n - 1 && f != 0 && n != 1){
        			if(Math.abs(f / c2) < Math.abs(xc)){
        				return 0;
        			}
        			if(Math.abs(f - ri) < Math.abs(riz)){
        				return 0;
        			}
        		}
        		ri += riz;
        		x = x % c;
        		c /= 10;
        		c2 *= 10;
        	}
        return ri;
    }
}
