/*
* ˫ɫ��齱��Ϸ�н�����
* �н�������6����������1������������
* �������Ҫ���������6��1~33֮�䲻�ظ����������
* �������Ҫ���������1��1~16֮����������
*/
//����Random
import java.util.Random;
//�������鹤�߿�
import java.util.Arrays;

public class BallTest{
	
	//������
	public static void main(String[] args){
		
		//1. ����һ���������ڴ��˫ɫ���н�����
		int[] arr= new int[7];  
		
		//2. ǰ6 ����ź�����룬�������Ҫ���������6��1~33֮�䲻�ظ����������
		for(int i=0;i<arr.length-1;i++){
			// �������1~33֮��ĺ���
			Random ra = new Random();
			arr[i]=ra.nextInt(33)+1;; //���������ֵ������Ԫ��	
			// �ж��Ƿ����ظ�
				for (int j=0;j<i;j++){
			      //��arr[i]��iǰ�����������Ԫ�ؽ��бȽϣ����Ƿ����ظ�
					while(arr[i]==arr[j]){  //���ظ�����������
						//��һ������
						arr[i]=ra.nextInt(33)+1;
					}
				}
			}
	
		//3. ��ֵ��������룬�������Ҫ���������1��1~16֮����������
		Random rb = new Random();// �������1~16֮��ĺ���
		arr[6]=rb.nextInt(16)+1;//��һ������������ɵ������
		
		//4.�����ӡ
		System.out.println("˫ɫ���н�����Ϊ��"+ Arrays.toString(arr));
	
		
	}
}