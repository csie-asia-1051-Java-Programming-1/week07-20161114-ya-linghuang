package ex;
/*請寫一個程式，用陣列儲存使用者輸入的 n 個整數，
 * 透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入有幾個整數: ");		//輸入整數
		int n = scn.nextInt();
		float [] data = new float[n];
		System.out.println("請輸入整數: ");
		for(int i=0 ; i<n ; i++){
			data[i]=scn.nextInt();
		}
		System.out.println("變異數為: "+var(n,data));
	}
	public static float var(float x,float[] y){
		float m = 0;												//算 平均數
		for(int i=0 ; i<x ; i++){
			m=m+y[i];
		}
		m=m/x;
		for(int i=0 ; i<x ; i++){						//算 (數-平均數)的平方
			y[i]=y[i]-m;
			y[i]=(float)Math.pow(y[i], 2);
		}
		float o2 = 0;												//算 變異數
		for(int i=0 ; i<x ; i++){
			o2=o2+y[i];
		}
		o2=o2/x;
		return o2;
	}

}
