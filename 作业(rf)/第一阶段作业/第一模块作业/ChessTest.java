/*
* ʹ�ö�ά�����ѭ��ʵ���������̻���
* ��������16��10��

*/
//�������鹤�߰�
import java.util.Arrays;

public class ChessTest{
	
	//������
	public static void main(String[] args){
		
		//1. ����һ����ά����
		char[][] arr = new char[16][9];
		//2.��ʾ���пո�
		System.out.print(' '+"      ");
		//3. ��ֵ����һ�в���ʾ
		int[] brr=new int[9];
		//��һ����Ϊ     0��1��2��3��4��5��6��7��8
		for(int i=0;i<brr.length;i++){
			brr[i]=i;
			System.out.print(brr[i]+"      ");
		}
		System.out.println();
		
		//4. ��ֵ��������
		for (int i=0;i<arr.length;i++){
			//�����е���Ԫ��Ϊi-1
			for (int j=0;j<arr[i].length;j++){
				//��ֵ ������Ԫ��Ϊ+
				arr[i][j]='+';
				
			}
		}
		//4.���
	  for(int i=0;i<arr.length;i++){
		  //��ʾ����
		    if (i<=9){
				System.out.print(i+"      ");
			}else {
				System.out.print((char)(i-10+97)+"      ");
			}
		  	
			for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+"      ");
		}
			System.out.println();
		}
		
	}
}	
