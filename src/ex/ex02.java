package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int v = 0;
		String s = "";
		String sum ="";
		while(a>0){
			sum = sum+a%10*(int)Math.pow(a, v);
			a=a/10;
			v++;
		}
		System.out.print(sum);
		while(a>0){
			s =a%c+sum;
			a=a/c;
			
		}
		System.out.print(sum);
		
	}

}
