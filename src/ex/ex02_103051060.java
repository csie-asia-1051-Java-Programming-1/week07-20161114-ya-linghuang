package ex;
/*承上題，除了var() 函數之外，再用建立一個 std() 函數，
 * 程式在接收完使用者輸入的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，
 * 特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，
 * 主程式再把結果印出。
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

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
		System.out.println("標準差為: "+std(n,data));
	}
	public static float std(float x,float[]y){
		float fin = var(x,y);
		fin=(float)Math.sqrt(fin);
		return fin;
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
