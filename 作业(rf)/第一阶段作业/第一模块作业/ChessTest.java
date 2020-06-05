/*
* 使用二维数组和循环实现五子棋盘绘制
* 五子棋盘16行10列

*/
//导入数组工具包
import java.util.Arrays;

public class ChessTest{
	
	//主方法
	public static void main(String[] args){
		
		//1. 声明一个二维数组
		char[][] arr = new char[16][16];
		//2.显示首行空格
		System.out.print(' '+"  ");
		//3. 赋值给第一行并显示
		//第一行则为     0，1，2，3，4，5，6，7，8,9,q,b,c,d,e,f
		for(int i=0;i<=15;i++){
			System.out.printf("%x",i);
			System.out.print("  ");
		}
		System.out.println();
		
		//4. 赋值给其他行
		for (int i=0;i<arr.length;i++){
			//其余行的首元素为i-1
			for (int j=0;j<arr[i].length;j++){
				//赋值 其他列元素为+
				arr[i][j]='+';
				
			}
		}
		//4.输出
	  for(int i=0;i<arr.length;i++){
		  //显示首列
		   
				System.out.printf("%x",i);
				System.out.print("  ");
			for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+"  ");
		}
			System.out.println();
		}
		
	}
}	
