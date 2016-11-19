package hw;
/*輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩整數: ");
		int x =scn.nextInt();
		int y =scn.nextInt();
		System.out.println("C(m,n)="+C(x,y));
	}
	public static int C(int m , int n){
		int num = oh(m)/(oh(n)*oh(m-n));
		return num;
	}
	public static int oh(int i){
		if(i==1){
			return 1;
		}else{
			return i*oh(i-1);
		}
	}
}
