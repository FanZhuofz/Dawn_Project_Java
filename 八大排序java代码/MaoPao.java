package xyz.dawnfan.pxdemo;

/**
 * ð������
 * �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������  
 * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������  
 * ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ� 
 * @param numbers ��Ҫ�������������
 */
public class MaoPao {

	/**
	 * 	ԭ���У� 49 38 65 97 76 13 27 49 89 86 57
	 *  ��һ�Σ� 38 49 65 76 13 27 49 89 86 57 97
	 *  �ڶ��Σ� 38 49 65 13 27 49 76 86 57 89 97
	 *  �����Σ� 38 49 13 27 49 65 76 57 86 89 97
	 *  ���ĴΣ� 38 13 27 49 49 65 57 76 86 89 97
	 *  ����Σ� 13 27 38 49 49 57 65 76 86 89 97
	 *  �����Σ� 13 27 38 49 49 57 65 76 86 89 97
	 *  
	 * @param numbers
	 */
	public static void bubbleSort(int[] numbers)
	{
	    int temp = 0;
	    for(int i=0;i<numbers.length-1;i++)
	    {
	    for(int j=0;j<numbers.length-1-i;j++)
	    {
	        if(numbers[j] > numbers[j+1])  //��������λ��
	        {
	        temp = numbers[j];
	        numbers[j] = numbers[j+1];
	        numbers[j+1] = temp;
	        }
	    }
	    }
	}
	public static void main(String[] args) {
		int numbers[] =new int[]{49,38,65,97,76,13,27,49,89,86,57};
		MaoPao.bubbleSort(numbers);
		for(int arr:numbers){
			System.out.print(arr+" ");
		}
	}
}