/*
* �ҳ�1000���ڵ�������������ӡ��������������һ����ǡ�õ�����������֮�ͣ���6=1+2+3
*/

public class NumTest{
	
	//������
	public static void main(String[] args){
		
		//1. ��ӡ1000���ڵ�������
		for(int i=1;i<1000;i++){
			//System.out.println("i="+i);
	
		//2. �ҳ�һ�������������Ӳ�����������������֮��
		int count=0; //����һ���������ڴ��һ��������������֮��
		for(int j=1;j<i;j++){
			//i�ܱ�j����,˵��j��i������
			if (i%j==0){
				count+=j;	//���������
				}  

			}
		//System.out.println("i����������֮��Ϊ"+count);
		//3. �жϸ����Ƿ�Ϊ����
		if (count==i){
			System.out.println(i+"������"); //��ӡ���
			}
		
	
		}
	}
}