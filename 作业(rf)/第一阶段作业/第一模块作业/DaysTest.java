/*
* ��ʾ�û�������������Ϣ���ж���һ������һ���еĵڼ��첢��ӡ
*/
//����Scanner��
import java.util.Scanner;

public class DaysTest{
	
	//������
	public static void main(String[] args){
		
		//1. ��ʾ�û�������������Ϣ
		System.out.println("����������������Ϣ������ 1996 08 22");
		
		//2. ��ȡ��������Ϣ
		Scanner sc = new Scanner(System.in);
		int year = sc. nextInt();
		int month = sc. nextInt();
		int day = sc. nextInt();
		//��ӡ����û��������Ϣ
		System.out.println("���������������Ϣ��:  "+year+"��"+month+"��"+day+"��");
		System.out.println();

		//3. ����һά���鲢��ʼ������������ÿ���·ݵ����� 
		//  1       2     3    4    5    6    7   8     9     10    11    12
		//  31   28(29)   31   30   31  30   31   31    30    31    30    31
		int[] arr = new int[]{31,0,31,30,31,30,31,31,30,31,30,31} ;  
		
		//4. ������ݸ�2�·ݸ���
		//�ж�����Ƿ�Ϊƽ������꣬��������ݳ���4��������ݳ���400�������ļ�Ϊ����
		if ((year%4==0 && year %100 !=0)||year %400==0){
			System.out.println(year+"��������");
			arr[1]=29;
		}else{
			System.out.println(year+"����ƽ��");
			arr[1]=28;		}
		System.out.println();
		
		//5.��������
		int count=0;//  �������
		for(int i=0;i<month-1;i++){
			count+=arr[i];  //���㵽��ǰ�·ݵ���������������ǰ�·�
		}
		count=count+day; //���ϵ�ǰ�·��ѹ�������
		System.out.println("��һ������һ��ĵ�"+count+"��");  //��ӡ���
	
	}
}