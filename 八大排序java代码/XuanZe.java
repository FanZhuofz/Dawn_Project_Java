package xyz.dawnfan.pxdemo;

public class XuanZe {

	/**
	 * ����˼�룺��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������
	 * Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ��
	 * 
	 * ѡ�������㷨
	 * ��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ��  
	 * �ٴ�ʣ��δ����Ԫ���м���Ѱ����СԪ�أ�Ȼ��ŵ���������ĩβ�� 
	 * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ� 
	 * @param numbers
	 */
		public static void selectSort(int[] numbers)
		{
			int size = numbers.length; //���鳤��
			int temp = 0 ; //�м����

			for(int i = 0 ; i < size ; i++)
			{
				int k = i;   //��ȷ����λ��
				//ѡ���Ӧ���ڵ�i��λ�õ���
			    for(int j = size -1 ; j > i ; j--)
			    {
			    	if(numbers[j] < numbers[k])
			    	{
			    		k = j;
			    	}
			    }
			    //����������
			    temp = numbers[i];
			    numbers[i] = numbers[k];
			    numbers[k] = temp;
			}
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int numbers[]=new int[]{49,38,65,97,76,13,27,49,89,86,57};
			XuanZe.selectSort(numbers);
			for(int arr:numbers){
				System.out.print(arr+" ");
			}
		}

}
