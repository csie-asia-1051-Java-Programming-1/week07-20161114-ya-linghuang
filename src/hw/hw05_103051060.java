package hw;
/*寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。例如:輸入 1234 回傳 4321
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw05_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入整數: ");
		long a =scn.nextLong();
		//String b=Long.toString(a);
		//char[]data = b.toCharArray();
		change(a);
		//change(data.length-1,data);
	}
	public static void change(long x){
		
	}
	/*public static int change(int x,char[]y){		
		System.out.print(y[x]);
		if(x==0){				
			return 0;
		}else{			
			return change((x-1), y);			
		}
	}
*/
}
