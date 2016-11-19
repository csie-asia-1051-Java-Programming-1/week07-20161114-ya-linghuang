package hw;
/*以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一不為0的正整數: ");
		int a =scn.nextInt();
		int b =0;
		System.out.println("位數為: "+ofdigits(a, b));
	}
	public static int ofdigits (int x , int num){
		if(x!=0){
			x=x/10;
			num=num+1;
			return ofdigits(x, num);
		}else{
			return num;
		}
	}

}
