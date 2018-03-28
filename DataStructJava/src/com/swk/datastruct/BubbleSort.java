/**
 * @createTime: 2018年3月22日
 */
package com.swk.datastruct;

import java.util.Arrays;

/**
 * @classDesc: 类描述: 冒泡排序
 * @author vico
 * @createTime 2018年3月22日 下午10:42:40
 * @version v1.0.0
 */
public class BubbleSort {

	/**
	 * @methodDesc: 方法描述: 冒泡排序
	 * @author vico
	 * @createTime 2018年3月14日 上午7:08:42
	 * @version v1.0.0
	 * @param arry
	 * @return
	 *
	 */
	public static  int[] bubbleSort(int[] arry)
	{
		boolean change=true;
		int n=arry.length;
		for(int i=n-1;i>=1&&change;--i)
		{
			change=false;
			for(int j=0;j<i;++j)
			{
				if(arry[j]>arry[j+1])
				{
					int temp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
					change=true;
				}
			}
			
		}
		return arry;
	}
	
	                                                                                                                                                                                                         
	
	public static void main(String[] args) {
		
		int[] arry=new int[]{25,63,1,9,2,5,7,2};
		BubbleSort.bubbleSort(arry);
		System.out.println(Arrays.toString(arry));
	}
	
}
