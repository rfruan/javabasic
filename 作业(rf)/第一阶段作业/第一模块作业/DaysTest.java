/*
* 提示用户输入年月日信息，判断这一天是这一年中的第几天并打印
*/
//导入Scanner包
import java.util.Scanner;

public class DaysTest{
	
	//主方法
	public static void main(String[] args){
		
		//1. 提示用户输入年月日信息
		System.out.println("请您输入年月日信息，例： 1996 08 22");
		
		//2. 读取年月日信息
		Scanner sc = new Scanner(System.in);
		int year = sc. nextInt();
		int month = sc. nextInt();
		int day = sc. nextInt();
		//打印输出用户输入的信息
		System.out.println("您输入的年月日信息是:  "+year+"年"+month+"月"+day+"日");
		System.out.println();

		//3. 声明一维数组并初始化，用数组存放每个月份的天数 
		//  1       2     3    4    5    6    7   8     9     10    11    12
		//  31   28(29)   31   30   31  30   31   31    30    31    30    31
		int[] arr = new int[]{31,0,31,30,31,30,31,31,30,31,30,31} ;  
		
		//4. 根据年份给2月份复制
		//判断年份是否为平年或闰年，非整百年份除以4，整百年份除以400能整除的即为闰年
		if ((year%4==0 && year %100 !=0)||year %400==0){
			System.out.println(year+"年是闰年");
			arr[1]=29;
		}else{
			System.out.println(year+"年是平年");
			arr[1]=28;		}
		System.out.println();
		
		//5.计算天数
		int count=0;//  存放天数
		for(int i=0;i<month-1;i++){
			count+=arr[i];  //计算到当前月份的天数，不包含当前月份
		}
		count=count+day; //加上当前月份已过的天数
		System.out.println("这一天是这一年的第"+count+"天");  //打印输出
	
	}
}