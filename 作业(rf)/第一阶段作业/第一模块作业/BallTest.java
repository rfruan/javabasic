/*
* 双色球抽奖游戏中奖号码
* 中奖号码由6个红球号码和1个蓝球号码组成
* 红球号码要求随机生成6个1~33之间不重复的随机号码
* 篮球号码要求随机生成1个1~16之间的随机号码
*/
//导入Random
import java.util.Random;
//导入数组工具库
import java.util.Arrays;

public class BallTest{
	
	//主方法
	public static void main(String[] args){
		
		//1. 声明一个数组用于存放双色球中奖号码
		int[] arr= new int[7];  
		
		//2. 前6 个存放红球号码，红球号码要求随机生成6个1~33之间不重复的随机号码
		for(int i=0;i<arr.length-1;i++){
			// 随机生成1~33之间的号码
			Random ra = new Random();
			arr[i]=ra.nextInt(33)+1;; //将随机数赋值给数组元素	
			// 判断是否有重复
				for (int j=0;j<i;j++){
			      //将arr[i]与i前面的所有数组元素进行比较，看是否有重复
					while(arr[i]==arr[j]){  //有重复便重新生成
						//再一次生成
						arr[i]=ra.nextInt(33)+1;
					}
				}
			}
	
		//3. 赋值给蓝球号码，篮球号码要求随机生成1个1~16之间的随机号码
		Random rb = new Random();// 随机生成1~16之间的号码
		arr[6]=rb.nextInt(16)+1;//用一个变量存放生成的随机数
		
		//4.输出打印
		System.out.println("双色球中奖号码为："+ Arrays.toString(arr));
	
		
	}
}