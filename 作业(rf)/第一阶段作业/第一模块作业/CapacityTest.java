/*
* 自定义数组扩容规则
* 当已存储元素数量达到总容量的80%时，扩容1.5倍
* 例如：总容量为10；当输入第8个元素时，数组进行扩容，容量从10变成15
*/
//导入数组工具包
import java.util.Arrays;
//导入输入工具包
import java.util.Scanner;

public class CapacityTest{
	
	//主方法
	public static void main(String[] args){
		
		//1. 提示用户输入初始容量大小并打印
		System.out.println("请您输入初始容量大小");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  //用一个变量存储初始容量大小
		System.out.println("初始数组的容量大小为"+num);//打印输出
		System.out.println("-----------------------------------------------");
		System.out.println();
		//2. 声明一个数组，存放输入的数据
		int[] arr= new int[num];

		//3. 提示用户输入数组元素
		outer: for(int i=1;i<num;i++){   //终止条件为达到输入容量的80%
				
			//输入数组元素数据
			System.out.println("请您输入第"+i+"个数组元素");
			//将输入的数据存放进数组中
			arr[i-1]=sc.nextInt();
			if (i>=(int)(num*0.8)){
				//4. 扩容
				System.out.println("-----------------------------------------------");
				System.out.println();
				System.out.println("容量已经达到总容量到80%，现在为您扩容");
				num =(int)(num*1.5);
				//5.声明一个扩容后的数组，并将之前录入的数据拷贝到扩容数组
				int[] brr=new int[num];
				System.arraycopy(arr,0,brr,0,arr.length);
				//6. 丢弃原有数组内存单元，将现有的扩容数组地址赋给原数组，容量为扩展后的容量大小
				arr=brr;
				//7.输出打印
				System.out.println("现在的数据容量为"+ num);
				System.out.println("数组数据为"+ Arrays.toString(brr));
				System.out.println();
				System.out.println("-----------------------------------------------");
				System.out.println();
				//8. 判断是否仍要继续输入
				System.out.println("您想要继续输入数组元素吗？  Y/N");
				System.out.println();
				String str= sc.next();
				//9. Y 继续输入，自动扩容
				if("Y".equals(str)){
					System.out.println("现在继续输入");
					System.out.println("-----------------------------------------------");
				} else{
					System.out.println("退出输入对话框，谢谢！");
					break outer;  //跳出循环
				}
			}
		}
	}
}	
