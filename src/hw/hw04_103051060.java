package hw;
/*寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩數: ");
		int x =scn.nextInt();
		int y =scn.nextInt();
		if(y>x){
			int i =y;
			y=x;
			x=y;
		}
		System.out.println("最大公因數為: "+gcd(x,y));
	}
		public static int gcd(int m,int n){
				if(m%n==0){								//小的數為最大公因數情況
					return n;
				}else{
					return gcd(n, m%n);				//找公因數
				}			
		}
}
