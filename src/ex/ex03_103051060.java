package ex;
/*請寫一個程式，讓使用者輸入一個整數二維陣列，
 * 建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，並把結果回傳到主程式印出。
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);				//輸入二維陣列
		System.out.println("請輸入有幾組: ");
		int n = scn.nextInt();
		System.out.println("請輸入各組各有幾個整數: ");	
		int n2 =scn.nextInt();
		float [][] data = new float[n][n2];
		float[][] ndata = new float[n][n2];
		System.out.println("請輸入整數: ");
		for(int i=0 ; i<n ; i++){															//組
			for(int j=0 ; j<n2 ; j++){														//組內數
				data[i][j]=scn.nextInt();
				ndata[i][j]=data[i][j];
			}
			System.out.println();
		}
		System.out.print("變異數為: "+var2(n,n2,data)+"標準差為: "+std2(n,n2,ndata));
	}
	public static float std2(float x,float y,float[][] z){
		float fin =0 ;
		fin=(float)Math.sqrt(var2(x,y,z));
		return fin;
	}
	public static float  var2(float x,float y,float[][] z){
		float m = 0;												//算 平均數
		for(int i=0 ; i<x ; i++){
			for(int j=0 ; j<y ; j++){	
				m=m+z[i][j];
			}
		}
		m=m/(x*y);
		for(int i=0 ; i<x ; i++){						//算 (數-平均數)的平方
			for(int j=0 ; j<y ; j++){	
				z[i][j]=z[i][j]-m;
				z[i][j]=(float)Math.pow(z[i][j], 2);
			}
		}
		float o2 = 0;												//算 變異數
		for(int i=0 ; i<x ; i++){
			for(int j=0 ; j<y ; j++){
				o2=o2+z[i][j];
			}
		}
		o2=o2/(x*y);
		return o2;
	}
}
