/*
* 找出1000以内的所有完数并打印出来，完数就是一个数恰好等于它的因子之和，如6=1+2+3
*/

public class NumTest{
	
	//主方法
	public static void main(String[] args){
		
		//1. 打印1000以内的所有数
		for(int i=1;i<1000;i++){
			//System.out.println("i="+i);
	
		//2. 找出一个数的所有因子并计算它的所有因子之和
		int count=0; //声明一个变量用于存放一个数的所有因子之和
		for(int j=1;j<i;j++){
			//i能被j整除,说明j是i的因子
			if (i%j==0){
				count+=j;	//将因子相加
				}  

			}
		//System.out.println("i的所有因子之和为"+count);
		//3. 判断该数是否为完数
		if (count==i){
			System.out.println(i+"是完数"); //打印输出
			}
		
	
		}
	}
}