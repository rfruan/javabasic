/*
* �Զ����������ݹ���
* ���Ѵ洢Ԫ�������ﵽ��������80%ʱ������1.5��
* ���磺������Ϊ10���������8��Ԫ��ʱ������������ݣ�������10���15
*/
//�������鹤�߰�
import java.util.Arrays;
//�������빤�߰�
import java.util.Scanner;

public class CapacityTest{
	
	//������
	public static void main(String[] args){
		
		//1. ��ʾ�û������ʼ������С����ӡ
		System.out.println("���������ʼ������С");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  //��һ�������洢��ʼ������С
		System.out.println("��ʼ�����������СΪ"+num);//��ӡ���
		System.out.println("-----------------------------------------------");
		System.out.println();
		//2. ����һ�����飬������������
		int[] arr= new int[num];

		//3. ��ʾ�û���������Ԫ��
		outer: for(int i=1;i<num;i++){   //��ֹ����Ϊ�ﵽ����������80%
				
			//��������Ԫ������
			System.out.println("���������"+i+"������Ԫ��");
			//����������ݴ�Ž�������
			arr[i-1]=sc.nextInt();
			if (i>=(int)(num*0.8)){
				//4. ����
				System.out.println("-----------------------------------------------");
				System.out.println();
				System.out.println("�����Ѿ��ﵽ��������80%������Ϊ������");
				num =(int)(num*1.5);
				//5.����һ�����ݺ�����飬����֮ǰ¼������ݿ�������������
				int[] brr=new int[num];
				System.arraycopy(arr,0,brr,0,arr.length);
				//6. ����ԭ�������ڴ浥Ԫ�������е����������ַ����ԭ���飬����Ϊ��չ���������С
				arr=brr;
				//7.�����ӡ
				System.out.println("���ڵ���������Ϊ"+ num);
				System.out.println("��������Ϊ"+ Arrays.toString(brr));
				System.out.println();
				System.out.println("-----------------------------------------------");
				System.out.println();
				//8. �ж��Ƿ���Ҫ��������
				System.out.println("����Ҫ������������Ԫ����  Y/N");
				System.out.println();
				String str= sc.next();
				//9. Y �������룬�Զ�����
				if("Y".equals(str)){
					System.out.println("���ڼ�������");
					System.out.println("-----------------------------------------------");
				} else{
					System.out.println("�˳�����Ի���лл��");
					break outer;  //����ѭ��
				}
			}
		}
	}
}	
