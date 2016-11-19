package hw;
/*請寫一函數 lcm(x,y,z)，求三數 x、y、z 之最小公倍數
 * Date: 2016/11/14
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三數: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		System.out.println("最小公倍數為: "+lcm(a, b, c));
	}
	public static int lcm(int x ,int y, int z){
		int num = 1;
		while(true){
			if(num%x==0 && num%y==0 && num%z==0){
				break;
			}else{
				num=num+1;
			}
		}
		return num;
	}

}
