package ex;
/*讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入n: ");
		int n = scn.nextInt();
		System.out.println(ow(n));
	}
public static int ow(int x){
	if(x==1){
		return 1;
	}else{
		return x*ow(x-1);
	}
}
}
