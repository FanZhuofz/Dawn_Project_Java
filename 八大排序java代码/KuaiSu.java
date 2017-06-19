package xyz.dawnfan.pxdemo;

/**
 * ˼�룺���������п���һ�����飬�ѵ����λ�ÿ������ᣬ�����һ���ȣ��������С���������������κδ���
 * �������Ժ��ٺ�С���Ƕ˱ȣ�����С�������������󽻻�������ѭ��������һ��������ɣ���߾��Ǳ�����С�ģ�
 * �ұ߾��Ǳ������ģ�Ȼ�����÷��η����ֱ�������������������������
 * 
 * @author Administrator
 *
 * ע����ʱ��֧�����������������
 */
public class KuaiSu {
	
	/**
     * ���ҳ����ᣨĬ�������λlow������numbers�������������λ��
     * @param numbers ����������
     * @param low   ��ʼλ��
     * @param high  ����λ��
     * @return  ��������λ��
     */
    public static int getMiddle(int[] numbers, int low,int high)
    {
        int temp = numbers[low]; //����ĵ�һ����Ϊ����
        while(low<high)
        {
	        while(low < high && numbers[high] > temp)
	        {
	            high--;
	        }
	        numbers[low] = numbers[high];//������С�ļ�¼�Ƶ��Ͷ�
	        while(low < high && numbers[low] < temp)
	        {
	            low++;
	        }
	        numbers[high] = numbers[low] ; //�������ļ�¼�Ƶ��߶�
	    }
        numbers[low] = temp ; //�����¼��β
        return low ; // ���������λ��
    }
    
    
    /**
     * �ݹ���ʽ�ķ��������㷨��
     * @param numbers ����������
     * @param low  ��ʼλ��
     * @param high ����λ��
     */
    public static void quickSort(int[] numbers,int low,int high)
    {
        if(low < high)
        {
        	int middle = getMiddle(numbers,low,high); //��numbers�������һ��Ϊ��
        	quickSort(numbers, low, middle-1);   //�Ե��ֶα���еݹ�����
        	quickSort(numbers, middle+1, high); //�Ը��ֶα���еݹ�����
        }
    
    }
    
    
    /**
     * ���������ṩ��������
     * ��������
     * @param numbers ����������
     */
    public static void quick(int[] numbers)
    {
        if(numbers.length > 0)   //�鿴�����Ƿ�Ϊ��
        {
        quickSort(numbers, 0, numbers.length-1);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] =new int[]{49,38,65,97,76,13,88,27,89,86,57};
		//KuaiSu.getMiddle(numbers, 0, numbers.length-1);
		KuaiSu.quick(numbers);
		for(int arr:numbers){
			System.out.print(arr+" ");
		}
	}

}
