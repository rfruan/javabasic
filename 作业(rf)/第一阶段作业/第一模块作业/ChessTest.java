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
		char[][] arr = new char[16][16];
		//2.��ʾ���пո�
		System.out.print(' '+"  ");
		//3. ��ֵ����һ�в���ʾ
		//��һ����Ϊ     0��1��2��3��4��5��6��7��8,9,q,b,c,d,e,f
		for(int i=0;i<=15;i++){
			System.out.printf("%x",i);
			System.out.print("  ");
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
		   
				System.out.printf("%x",i);
				System.out.print("  ");
			for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+"  ");
		}
			System.out.println();
		}
		
	}
}	
