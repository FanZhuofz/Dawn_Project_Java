package xyz.dawnfan.pxdemo;

public class ChaRu {

	/**  
     * ��������
     * 
     * ����˼�룺ÿ����һ��������ļ�¼������˳�����С���뵽ǰ���Ѿ�
     * ����������еĺ���λ�ã��Ӻ���ǰ�ҵ�����λ�ú󣩣�ֱ��ȫ������������Ϊֹ��
     * 
     * �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
     * ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�� 
     * �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��  
     * �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��  
     * ����Ԫ�ز��뵽��λ����  
     * �ظ�����2  
     * @param numbers  ����������
     */  
    public static void insertSort(int[] numbers)
    {
	    int size = numbers.length;
	    int temp = 0 ;
	    int j =  0;
    
	    for(int i = 0 ; i < size ; i++)
	    {
	        temp = numbers[i];
	        //����temp��ǰ���ֵС����ǰ���ֵ����
	        for(j = i ; j > 0 && temp < numbers[j-1] ; j --)
	        {
	        numbers[j] = numbers[j-1];
	        }
	        numbers[j] = temp;
	    }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]=new int[]{49,38,65,97,76,13,27,49,89,86,57};
		ChaRu.insertSort(numbers);
		for(int arr:numbers){
			System.out.print(arr+" ");
		}
	}

}
